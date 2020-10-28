package com.example.gof.creational_patterns.abstract_factory;

import com.example.gof.creational_patterns.abstract_factory.topping.GoatMilk;
import com.example.gof.creational_patterns.abstract_factory.topping.IMilk;
import com.example.gof.creational_patterns.abstract_factory.topping.IYogurt;
import com.example.gof.creational_patterns.abstract_factory.topping.LightYogurt;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public IMilk createMilk() {
        return new GoatMilk();
    }

    @Override
    public IYogurt createYogurt() {
        return new LightYogurt();
    }
}
