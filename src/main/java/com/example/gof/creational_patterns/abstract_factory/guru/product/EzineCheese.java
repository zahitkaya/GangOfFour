package com.example.gof.creational_patterns.abstract_factory.guru.product;

import com.example.gof.creational_patterns.abstract_factory.guru.BaseToppingFactory;

public class EzineCheese extends Cheese {
    BaseToppingFactory baseToppingFactory;

    public EzineCheese(BaseToppingFactory baseToppingFactory) {
        this.baseToppingFactory = baseToppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Ezine peyniri için malzemeleriniz ekleniyor...");
        baseToppingFactory.createMilk();
        baseToppingFactory.createYogurt();
    }
}
