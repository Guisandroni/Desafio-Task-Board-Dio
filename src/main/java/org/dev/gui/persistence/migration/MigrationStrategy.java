package org.dev.gui.persistence.migration;

import liquibase.database.jvm.JdbcConnection;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.RequiredArgsConstructor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;

import static org.dev.gui.persistence.config.ConfigConnection.getConnection;

@RequiredArgsConstructor
public class MigrationStrategy {



        private final Connection connection;

        public void executeMigration(){
            var originalOut = System.out;
            var originalErr = System.err;
            try(var fos = new FileOutputStream("liquibase.log")){
                System.setOut(new PrintStream(fos));
                System.setErr(new PrintStream(fos));
                try(
                        var connection = getConnection();
                        var jdbcConnection = new JdbcConnection(connection);
                ){
                    var liquibase = new Liquibase(
                            "/db.migrations/db.migrations.yml",
                            new ClassLoaderResourceAccessor(),
                            jdbcConnection);
                    liquibase.update();
                } catch (SQLException | LiquibaseException e) {
                    e.printStackTrace();
                    System.setErr(originalErr);
                }
            } catch (IOException ex){
                ex.printStackTrace();
            } finally {
                System.setOut(originalOut);
                System.setErr(originalErr);
            }
        }


}
