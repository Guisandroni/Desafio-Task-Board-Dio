package org.dev.gui;

import org.dev.gui.gui.MainMenu;
import org.dev.gui.persistence.migration.MigrationStrategy;

import java.sql.Connection;
import java.sql.SQLException;

import static org.dev.gui.persistence.config.ConfigConnection.getConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        try(Connection connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}