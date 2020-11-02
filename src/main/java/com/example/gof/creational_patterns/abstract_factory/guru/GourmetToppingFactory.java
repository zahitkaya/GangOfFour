package com.example.gof.creational_patterns.abstract_factory.guru;

import com.example.gof.creational_patterns.abstract_factory.guru.topping.GoatMilk;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.IMilk;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.IYogurt;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.LightYogurt;

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
