package org.dev.gui.persistence.dao;


import lombok.AllArgsConstructor;
import org.dev.gui.persistence.entity.BlockEntity;
import org.dev.gui.persistence.entity.BoardEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.Optional;

import static org.dev.gui.persistence.converter.SetDateTimeConvert.toTimestamp;

@AllArgsConstructor
public class BlockDAO {
    private final Connection connection;

    public void block (final String reason, final Long card_Id) throws SQLException {
        var sql = "INSERT INTO BLOCKS(block_at, block_reason, card_id) VALUES( ?, ? ,? );";

        try(var statement = connection.prepareStatement(sql)){
           var i = 1;
           statement.setTimestamp(i ++, toTimestamp(OffsetDateTime.now()));
           statement.setString(i ++ , reason);
           statement.setLong(i, card_Id);
           statement.executeUpdate();
        }
    }


    public void unblock(final String reason, final Long card_Id) throws SQLException{
        var sql = "UPDATE BLOCKS SET unblock_at = ? , unblock_reason = ? where card_id = ? AND unblock_reason IS NULL";
        try(var statement = connection.prepareStatement(sql)){
            var i =1;
            statement.setTimestamp(i ++, toTimestamp(OffsetDateTime.now()));
            statement.setString(i ++ , reason);
            statement.setLong(i , card_Id);
            statement.executeUpdate();

        }
    }




}
