package com.example.gof.creational_patterns.abstract_factory.guru.topping;

public class LightYogurt implements IYogurt {
    public LightYogurt() {
        prepareYogurt();
    }

    @Override
    public void prepareYogurt() {
        System.out.println("Yağsız yoğurdunuz hazırlanıyor...");
    }
}
