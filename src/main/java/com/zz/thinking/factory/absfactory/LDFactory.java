package com.zz.thinking.factory.absfactory;

import com.zz.thinking.factory.pizza.LDCheesePizza;
import com.zz.thinking.factory.pizza.LDPepperPizza;
import com.zz.thinking.factory.pizza.Pizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
