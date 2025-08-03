package org.dev.gui.persistence.dao;


import com.mysql.cj.jdbc.StatementImpl;
import lombok.AllArgsConstructor;
import org.dev.gui.dto.DetailsCard;
import org.dev.gui.persistence.entity.CardEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import static java.util.Objects.nonNull;
import static org.dev.gui.persistence.converter.SetDateTimeConvert.toOffsetDateTime;

@AllArgsConstructor
public class CardDAO {

    private Connection connection;

    public CardEntity insert ( final CardEntity entity) throws SQLException {
        var sql =   "INSERT INTO cards (title, description, board_column_id) values(?,?,?)";
        try(var statement = connection.prepareStatement(sql)){
            var i = 1;
            statement.setString(i ++ ,entity.getTitle());
            statement.setString(i ++,entity.getDescription());
            statement.setLong(i ++,entity.getBoardColumn().getId());
            statement.executeUpdate();
            if(statement instanceof StatementImpl impl){
                entity.setId(impl.getLastInsertID());
            }
            }

        return entity;
    }


    public void moveToColumn(final Long columnId, final Long cardId) throws SQLException{
        var sql = "UPDATE cards SET board_column_id = ? WHERE id = ?;";
        try(var statement = connection.prepareStatement(sql)){
            var i = 1;
            statement.setLong(i ++, columnId);
            statement.setLong(i, cardId);
            statement.executeUpdate();
        }
    }

    public Optional<DetailsCard> findById(final Long id) throws SQLException {
        var sql =
                """
                SELECT c.id,
                       c.title,
                       c.description,
                       b.blocked_at,
                       b.block_reason,
                       c.board_column_id,
                       bc.name,
                       (SELECT COUNT(sub_b.id)
                               FROM blocks sub_b
                              WHERE sub_b.card_id = c.id) blocks_amount
                  FROM cards c
                  LEFT JOIN blocks b
                    ON c.id = b.card_id
                   AND b.unblocked_at IS NULL
                 INNER JOIN boards_Columns bc
                    ON bc.id = c.board_column_id
                  WHERE c.id = ?;
                """;
        try(var statement = connection.prepareStatement(sql)){
            statement.setLong(1, id);
            statement.executeQuery();
            var resultSet = statement.getResultSet();
            if (resultSet.next()){
                var dto = new DetailsCard(
                        resultSet.getLong("c.id"),
                        resultSet.getString("c.title"),
                        resultSet.getString("c.description"),
                        nonNull(resultSet.getString("b.block_reason")),
                        toOffsetDateTime(resultSet.getTimestamp("b.block_at")),
                        resultSet.getString("b.block_reason"),
                        resultSet.getInt("blocks_amount"),
                        resultSet.getLong("c.board_column_id"),
                        resultSet.getString("bc.name")
                );
                return Optional.of(dto);
            }
        }
        return Optional.empty();
    }



}
