package com.example.gof.creational_patterns.abstract_factory.simple_example.factory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
