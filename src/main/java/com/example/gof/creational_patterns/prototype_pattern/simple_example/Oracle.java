package com.example.gof.creational_patterns.prototype_pattern.simple_example;

public class Oracle extends DatabasePrototype{
    public Oracle() {
        this.setCorporate("Oracle");
        this.setName("oracle");
        this.setPort(1111);
    }
}
