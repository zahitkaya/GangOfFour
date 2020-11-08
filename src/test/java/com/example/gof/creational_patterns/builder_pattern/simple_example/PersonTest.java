package com.example.gof.creational_patterns.builder_pattern.simple_example;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person.Builder().name("Zahit").surname("Kaya").build(); //Adresi girmeden de objemiz oluştu.
        System.out.println(person.getName());
    }
}