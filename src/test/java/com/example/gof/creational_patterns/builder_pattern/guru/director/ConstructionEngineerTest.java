package com.example.gof.creational_patterns.builder_pattern.guru.director;


import com.example.gof.creational_patterns.builder_pattern.guru.builders.ConcreteHouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.guru.builders.HouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.guru.builders.PrefabricatedHouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.guru.product.House;
import org.junit.jupiter.api.Test;

public class ConstructionEngineerTest {
    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }

}