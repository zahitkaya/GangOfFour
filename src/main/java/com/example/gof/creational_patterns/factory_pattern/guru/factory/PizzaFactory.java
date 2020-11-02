package com.example.gof.creational_patterns.factory_pattern.guru.factory;

import com.example.gof.creational_patterns.factory_pattern.guru.pizza.CheesePizza;
import com.example.gof.creational_patterns.factory_pattern.guru.pizza.PepperoniPizza;
import com.example.gof.creational_patterns.factory_pattern.guru.pizza.Pizza;
import com.example.gof.creational_patterns.factory_pattern.guru.pizza.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory{
    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}