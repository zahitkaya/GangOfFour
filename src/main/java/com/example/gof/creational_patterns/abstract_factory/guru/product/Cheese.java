package com.example.gof.creational_patterns.abstract_factory.guru.product;

public abstract class Cheese {
    public abstract void addIngredients();
    public void bakeCheese(){
        System.out.println("Peyniriniz 20 dakika içerisinde hazır.");
    }
}
