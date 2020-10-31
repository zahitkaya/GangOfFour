package com.example.gof.creational_patterns.factory_pattern.factory;

import com.example.gof.creational_patterns.factory_pattern.pizza.CheesePizza;
import com.example.gof.creational_patterns.factory_pattern.pizza.PepperoniPizza;
import com.example.gof.creational_patterns.factory_pattern.pizza.Pizza;
import com.example.gof.creational_patterns.factory_pattern.pizza.VeggiePizza;

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