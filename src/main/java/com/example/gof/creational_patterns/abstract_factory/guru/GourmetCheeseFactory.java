package com.example.gof.creational_patterns.abstract_factory.guru;

import com.example.gof.creational_patterns.abstract_factory.guru.product.Cheese;
import com.example.gof.creational_patterns.abstract_factory.guru.product.EzineCheese;
import com.example.gof.creational_patterns.abstract_factory.guru.product.GoatCheese;
import com.example.gof.creational_patterns.abstract_factory.guru.product.TulumCheese;

public class GourmetCheeseFactory extends BaseCheeseFactory {


    @Override
    public Cheese createCheese(String type) {
        Cheese cheese;
        BaseToppingFactory baseToppingFactory=new GourmetToppingFactory();
        switch (type.toLowerCase()){
            case "tulum":
                cheese=new TulumCheese(baseToppingFactory);
                break;
            case "ezine":
                cheese=new EzineCheese(baseToppingFactory);
                break;
            case "keçi":
                cheese=new GoatCheese(baseToppingFactory);
                break;
            default: throw new IllegalArgumentException("Böyle bir peynir yok.");
        }
        cheese.bakeCheese();
        cheese.addIngredients();
        return cheese;
    }
}
