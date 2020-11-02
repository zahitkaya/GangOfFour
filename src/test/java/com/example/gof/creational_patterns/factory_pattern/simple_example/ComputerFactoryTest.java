package com.example.gof.creational_patterns.factory_pattern.simple_example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerFactoryTest {

    @Test
    void createComputer() {
        ComputerFactory computerFactory=new ComputerFactory();
        Asus asus=new Asus();
        Computer computer=computerFactory.createComputer(asus);
        computer.name();
    }
}