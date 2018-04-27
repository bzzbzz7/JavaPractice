package com.zz.java.thinking.create.factory.simplefactory;

import com.zz.java.thinking.create.factory.pizza.CheesePizza;
import com.zz.java.thinking.create.factory.pizza.PepperPizza;
import com.zz.java.thinking.create.factory.pizza.Pizza;
import com.zz.java.thinking.create.factory.pizza.GreekPizza;

public class SimplePizzaFactory {

    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;

    }

}
