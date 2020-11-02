package com.example.gof.creational_patterns.prototype_pattern.simple_example;

public class SqlServer extends DatabasePrototype {
    public SqlServer() {
        this.setName("SQL Server");
        this.setCorporate("Microsoft");
        this.setPort(1234);
    }
}
