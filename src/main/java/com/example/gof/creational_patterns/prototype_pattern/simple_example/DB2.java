package com.example.gof.creational_patterns.prototype_pattern.simple_example;

public class DB2 extends DatabasePrototype{
    public DB2() {
        this.setName("DB2");
        this.setCorporate("IBM");
        this.setPort(8888);
    }
}
