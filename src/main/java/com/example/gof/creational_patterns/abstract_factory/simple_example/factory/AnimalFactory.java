package com.example.gof.creational_patterns.abstract_factory.simple_example.factory;

import com.example.gof.creational_patterns.abstract_factory.simple_example.product_family.Animal;
import com.example.gof.creational_patterns.abstract_factory.simple_example.product_family.Dog;
import com.example.gof.creational_patterns.abstract_factory.simple_example.product_family.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
    }

}