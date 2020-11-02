package com.example.gof.creational_patterns.abstract_factory;


import com.example.gof.creational_patterns.abstract_factory.guru.BaseCheeseFactory;
import com.example.gof.creational_patterns.abstract_factory.guru.GourmetCheeseFactory;
import com.example.gof.creational_patterns.abstract_factory.guru.product.Cheese;
import org.junit.jupiter.api.Test;

public class GourmetCheeseFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
      //  BaseToppingFactory baseToppingFactory;
        BaseCheeseFactory baseCheeseFactory = new GourmetCheeseFactory();
        Cheese cheese = baseCheeseFactory.createCheese("ezine");
    }

}