package com.example.gof.creational_patterns.abstract_factory.simple_example.product_family;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
