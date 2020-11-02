package com.example.gof.creational_patterns.abstract_factory.guru;

import com.example.gof.creational_patterns.abstract_factory.guru.topping.IMilk;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.IYogurt;

public abstract class BaseToppingFactory {
    public abstract IMilk createMilk();
    public abstract IYogurt createYogurt();
}
