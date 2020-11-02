package com.example.gof.creational_patterns.abstract_factory.simple_example.factory;

import com.example.gof.creational_patterns.abstract_factory.simple_example.product_family.*;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String colorType) {
        if ("Blue".equalsIgnoreCase(colorType)) {
            return new Blue();
        } else if ("Red".equalsIgnoreCase(colorType)) {
            return new Red();
        }

        return null;
    }
}
