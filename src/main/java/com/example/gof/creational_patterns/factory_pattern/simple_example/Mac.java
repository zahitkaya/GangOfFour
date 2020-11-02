package com.example.gof.creational_patterns.factory_pattern.simple_example;

public class Mac implements Computer {

    @Override
    public void name() {
        System.out.println("Bilgisayarın Markası Mac");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " senesinde alınmış.");
    }

}
