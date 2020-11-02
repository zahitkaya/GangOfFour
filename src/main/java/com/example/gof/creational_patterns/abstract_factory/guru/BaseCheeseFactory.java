package com.example.gof.creational_patterns.abstract_factory.guru;

import com.example.gof.creational_patterns.abstract_factory.guru.product.Cheese;

public abstract class BaseCheeseFactory {
    public abstract Cheese createCheese(String type);
}
