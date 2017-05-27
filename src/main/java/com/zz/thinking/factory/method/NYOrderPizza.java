package com.zz.thinking.factory.method;

import com.zz.thinking.factory.pizza.NYCheesePizza;
import com.zz.thinking.factory.pizza.NYPepperPizza;
import com.zz.thinking.factory.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;

    }

}
