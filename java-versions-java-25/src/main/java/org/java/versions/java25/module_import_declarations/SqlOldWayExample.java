package org.java.versions.java25.module_import_declarations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlOldWayExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Example for MySQL
        String user = "username";
        String password = "password";

        try (final Connection connection = DriverManager.getConnection(url, user, password);
                final Statement statement = connection.createStatement()) {

            statement.execute("query");

            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}