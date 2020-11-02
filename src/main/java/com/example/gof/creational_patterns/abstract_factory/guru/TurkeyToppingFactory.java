package com.example.gof.creational_patterns.abstract_factory.guru;

import com.example.gof.creational_patterns.abstract_factory.guru.topping.CowMilk;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.IMilk;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.IYogurt;
import com.example.gof.creational_patterns.abstract_factory.guru.topping.VillageYogurt;

public class TurkeyToppingFactory extends BaseToppingFactory {
    @Override
    public IMilk createMilk() {
        return new CowMilk();
    }

    @Override
    public IYogurt createYogurt() {
        return new VillageYogurt();
    }
}
