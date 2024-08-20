package com.joshop.inventory.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "jopwd";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to database URL: " + connection.getMetaData().getURL());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
