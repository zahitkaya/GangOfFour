package com.example.gof.creational_patterns.abstract_factory.guru.product;

import com.example.gof.creational_patterns.abstract_factory.guru.BaseToppingFactory;

public class TulumCheese extends Cheese {
    BaseToppingFactory baseToppingFactory;

    public TulumCheese(BaseToppingFactory baseToppingFactory) {
        this.baseToppingFactory = baseToppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Tulum peyniri için malzemeleriniz ekleniyor...");
        baseToppingFactory.createMilk();
        baseToppingFactory.createYogurt();
    }
}
