package com.example.gof.creational_patterns.abstract_factory.simple_example;
import com.example.gof.creational_patterns.abstract_factory.simple_example.factory.AbstractFactory;
import com.example.gof.creational_patterns.abstract_factory.simple_example.factory.AnimalFactory;
import com.example.gof.creational_patterns.abstract_factory.simple_example.factory.ColorFactory;
import org.springframework.stereotype.Component;

@Component
public class FactoryProvider {
    public  AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
           return new ColorFactory();
        }

        return null;
    }
}
