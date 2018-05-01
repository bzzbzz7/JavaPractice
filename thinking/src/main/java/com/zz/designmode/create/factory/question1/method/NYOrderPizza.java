package com.zz.designmode.create.factory.question1.method;

import com.zz.designmode.create.factory.question1.pizza.Pizza;
import com.zz.designmode.create.factory.question1.pizza.NYCheesePizza;
import com.zz.designmode.create.factory.question1.pizza.NYPepperPizza;

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
