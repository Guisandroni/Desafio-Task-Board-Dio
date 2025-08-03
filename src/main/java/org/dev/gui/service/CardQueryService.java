package org.dev.gui.service;

import lombok.AllArgsConstructor;
import org.dev.gui.dto.DetailsCard;
import org.dev.gui.persistence.dao.CardDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<DetailsCard> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }
}
