package com.example.gof.creational_patterns.abstract_factory.simple_example.product_family;

public class Blue implements Color {

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getAddress() {
        return "#4444444";
    }
}
