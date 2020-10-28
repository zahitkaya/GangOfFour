package com.example.gof.creational_patterns.abstract_factory;

import com.example.gof.creational_patterns.abstract_factory.product.Cheese;

public abstract class BaseCheeseFactory {
    public abstract Cheese createCheese(String type);
}
