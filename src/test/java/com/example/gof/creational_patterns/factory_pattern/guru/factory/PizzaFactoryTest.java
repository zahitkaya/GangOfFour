package com.example.gof.creational_patterns.factory_pattern.guru.factory;

import com.example.gof.creational_patterns.factory_pattern.guru.pizza.Pizza;
import org.junit.jupiter.api.Test;

class PizzaFactoryTest {

    @Test
    void createPizza() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}