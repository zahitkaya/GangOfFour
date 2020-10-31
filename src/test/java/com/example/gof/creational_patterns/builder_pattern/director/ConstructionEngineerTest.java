package com.example.gof.creational_patterns.builder_pattern.director;


import com.example.gof.creational_patterns.builder_pattern.builders.ConcreteHouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.builders.HouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.builders.PrefabricatedHouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.product.House;
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