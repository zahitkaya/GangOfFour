package com.example.gof.creational_patterns.abstract_factory.topping;

public class CowMilk implements IMilk {
    public CowMilk() {
        prepareMilk();
    }

    @Override
    public void prepareMilk() {
        System.out.println("İnek sütünüz hazırlanıyor...");
    }
}
