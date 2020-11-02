package com.example.gof.creational_patterns.abstract_factory.simple_example.product_family;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Hav";
    }
}
