package com.example.gof.creational_patterns.factory_pattern.guru.factory;

import com.example.gof.creational_patterns.factory_pattern.guru.pizza.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}

