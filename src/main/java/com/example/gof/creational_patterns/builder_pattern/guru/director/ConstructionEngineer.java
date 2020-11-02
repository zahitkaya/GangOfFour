package com.example.gof.creational_patterns.builder_pattern.guru.director;

import com.example.gof.creational_patterns.builder_pattern.guru.builders.HouseBuilder;
import com.example.gof.creational_patterns.builder_pattern.guru.product.House;

public class ConstructionEngineer {
    private HouseBuilder houseBuilder;
    public ConstructionEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
    }
}