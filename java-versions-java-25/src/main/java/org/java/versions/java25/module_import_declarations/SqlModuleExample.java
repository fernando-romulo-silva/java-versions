package org.java.versions.java25.module_import_declarations;

// A module import allows you to use all classes from the exported packages of a module:
import module java.sql;
import module java.base;

import java.util.Date; // ⟵ This resolves the ambiguity
// import java.util.*; // ⟵ This also resolves the ambiguity

public class SqlModuleExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Example for MySQL
        String user = "username";
        String password = "password";

        try (final Connection connection = DriverManager.getConnection(url, user, password);
                final Statement statement = connection.createStatement()) {

            statement.execute("query");

            Date date = new Date();

            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}