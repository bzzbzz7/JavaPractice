package com.zz.java.thinking.create.factory.method;

import com.zz.java.thinking.create.factory.pizza.LDCheesePizza;
import com.zz.java.thinking.create.factory.pizza.LDPepperPizza;
import com.zz.java.thinking.create.factory.pizza.Pizza;

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
