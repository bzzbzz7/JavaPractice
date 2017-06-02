package com.zz.java.thinking.create.factory.method;

import com.zz.java.thinking.create.factory.pizza.Pizza;
import com.zz.java.thinking.create.factory.pizza.NYCheesePizza;
import com.zz.java.thinking.create.factory.pizza.NYPepperPizza;

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
