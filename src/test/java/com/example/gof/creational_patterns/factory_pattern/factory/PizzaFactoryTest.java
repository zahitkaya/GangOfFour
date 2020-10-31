package com.example.gof.creational_patterns.factory_pattern.factory;

import com.example.gof.creational_patterns.factory_pattern.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    @Test
    void createPizza() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}