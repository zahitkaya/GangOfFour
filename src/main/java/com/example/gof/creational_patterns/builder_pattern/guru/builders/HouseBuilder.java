package com.example.gof.creational_patterns.builder_pattern.guru.builders;

import com.example.gof.creational_patterns.builder_pattern.guru.product.House;

public interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void paintHouse();

    void furnishHouse();

    House getHouse();
}
