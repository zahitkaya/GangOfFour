package com.example.gof.creational_patterns.prototype_pattern.simple_example;

import org.junit.jupiter.api.Test;

class DatabasePrototypeTest {

    @Test
    void getClone() {
        DatabasePrototype databasePrototype=new DB2();
        System.out.println(databasePrototype.toString()); //DatabasePrototype{corporate='IBM', name='DB2', port=8888}

        try {
            DatabasePrototype oracle1= (DatabasePrototype) databasePrototype.clone();

            oracle1.setCorporate("Oracle");
            oracle1.setName("oracle");
            oracle1.setPort(5555);
            System.out.println(oracle1.toString());
            System.out.println(databasePrototype.toString()); //DatabasePrototype{corporate='IBM', name='DB2', port=8888}
            System.out.println(oracle1.toString());//DatabasePrototype{corporate='Oracle', name='oracle', port=5555}
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}