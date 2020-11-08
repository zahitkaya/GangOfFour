package com.example.gof.creational_patterns.abstract_factory.simple_example;

import com.example.gof.creational_patterns.abstract_factory.simple_example.factory.AbstractFactory;
import com.example.gof.creational_patterns.abstract_factory.simple_example.product_family.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryProviderTest {

    @Autowired
    private FactoryProvider factoryProvider;
    @Test
    void getFactory() {
       //FactoryProvider factoryProvider= new FactoryProvider();
       AbstractFactory<Animal> abstractFactory=factoryProvider.getFactory("Animal");
       Animal animal=abstractFactory.create("Dog");
        System.out.println(animal.getAnimal());
    }
}