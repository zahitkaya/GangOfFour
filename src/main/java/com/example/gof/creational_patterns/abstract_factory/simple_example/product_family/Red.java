package com.example.gof.creational_patterns.abstract_factory.simple_example.product_family;

public class Red implements Color {
    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getAddress() {
        return "#123123213";
    }
}
