package com.joshop.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/url")
    public String getDataSourceUrl() {
        try (Connection connection = dataSource.getConnection()) {
            return "Connected to database URL: " + connection.getMetaData().getURL();
        } catch (SQLException e) {
            return "Failed to connect: " + e.getMessage();
        }
    }
}
