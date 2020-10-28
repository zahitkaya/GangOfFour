package com.example.gof.creational_patterns.abstract_factory;

import com.example.gof.creational_patterns.abstract_factory.topping.IMilk;
import com.example.gof.creational_patterns.abstract_factory.topping.IYogurt;

public abstract class BaseToppingFactory {
    public abstract IMilk createMilk();
    public abstract IYogurt createYogurt();
}
