package com.zz.designmode.create.factory.simplefactory;

import com.zz.designmode.create.factory.pizza.CheesePizza;
import com.zz.designmode.create.factory.pizza.PepperPizza;
import com.zz.designmode.create.factory.pizza.Pizza;
import com.zz.designmode.create.factory.pizza.GreekPizza;

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
