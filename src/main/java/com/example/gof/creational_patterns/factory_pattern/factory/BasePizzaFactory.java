package com.example.gof.creational_patterns.factory_pattern.factory;

import com.example.gof.creational_patterns.factory_pattern.pizza.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}

