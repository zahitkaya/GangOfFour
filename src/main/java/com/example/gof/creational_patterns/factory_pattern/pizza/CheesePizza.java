package com.example.gof.creational_patterns.factory_pattern.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}