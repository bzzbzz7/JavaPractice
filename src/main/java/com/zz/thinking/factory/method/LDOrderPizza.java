package com.zz.thinking.factory.method;

import com.zz.thinking.factory.pizza.LDCheesePizza;
import com.zz.thinking.factory.pizza.LDPepperPizza;
import com.zz.thinking.factory.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
