package com.example.gof.creational_patterns.prototype_pattern.simple_example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabasePrototypeTest {

    @Test
    void getClone() {
        DatabasePrototype databasePrototype=new DB2();
        System.out.println(databasePrototype.toString()); //DatabasePrototype{corporate='IBM', name='DB2', port=8888}

        try {
            DatabasePrototype oracle= (DatabasePrototype) databasePrototype.clone();
            System.out.println(oracle.toString()); //DatabasePrototype{corporate='IBM', name='DB2', port=8888}
            oracle.setCorporate("Oracle");
            oracle.setName("oracle");
            oracle.setPort(5555);
            System.out.println(oracle.toString());//DatabasePrototype{corporate='Oracle', name='oracle', port=5555}
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}