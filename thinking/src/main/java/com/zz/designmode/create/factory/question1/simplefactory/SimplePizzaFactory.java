package com.zz.designmode.create.factory.question1.simplefactory;

import com.zz.designmode.create.factory.question1.pizza.CheesePizza;
import com.zz.designmode.create.factory.question1.pizza.PepperPizza;
import com.zz.designmode.create.factory.question1.pizza.Pizza;
import com.zz.designmode.create.factory.question1.pizza.GreekPizza;

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
