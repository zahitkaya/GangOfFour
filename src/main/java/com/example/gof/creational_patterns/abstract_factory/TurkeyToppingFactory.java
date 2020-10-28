package com.example.gof.creational_patterns.abstract_factory;

import com.example.gof.creational_patterns.abstract_factory.topping.CowMilk;
import com.example.gof.creational_patterns.abstract_factory.topping.IMilk;
import com.example.gof.creational_patterns.abstract_factory.topping.IYogurt;
import com.example.gof.creational_patterns.abstract_factory.topping.VillageYogurt;

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
