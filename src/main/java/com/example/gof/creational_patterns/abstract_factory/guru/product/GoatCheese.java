package com.example.gof.creational_patterns.abstract_factory.guru.product;

import com.example.gof.creational_patterns.abstract_factory.guru.BaseToppingFactory;

public class GoatCheese extends Cheese {
    BaseToppingFactory baseToppingFactory;

    public GoatCheese(BaseToppingFactory baseToppingFactory) {
        this.baseToppingFactory = baseToppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Keçi peyniri için malzemeleriniz ekleniyor...");
        baseToppingFactory.createYogurt();
        baseToppingFactory.createMilk();
    }

}
