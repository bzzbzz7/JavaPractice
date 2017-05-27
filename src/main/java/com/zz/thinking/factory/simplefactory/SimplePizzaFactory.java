package com.zz.thinking.factory.simplefactory;

import com.zz.thinking.factory.pizza.CheesePizza;
import com.zz.thinking.factory.pizza.GreekPizza;
import com.zz.thinking.factory.pizza.PepperPizza;
import com.zz.thinking.factory.pizza.Pizza;

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
