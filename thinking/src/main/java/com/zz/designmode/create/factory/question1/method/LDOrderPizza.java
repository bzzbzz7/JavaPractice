package com.zz.designmode.create.factory.question1.method;

import com.zz.designmode.create.factory.question1.pizza.LDCheesePizza;
import com.zz.designmode.create.factory.question1.pizza.LDPepperPizza;
import com.zz.designmode.create.factory.question1.pizza.Pizza;

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
