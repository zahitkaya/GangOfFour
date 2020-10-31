package com.example.gof.creational_patterns.factory_pattern.pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
