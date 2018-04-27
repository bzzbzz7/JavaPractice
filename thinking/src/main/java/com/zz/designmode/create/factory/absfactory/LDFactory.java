package com.zz.designmode.create.factory.absfactory;

import com.zz.designmode.create.factory.pizza.LDCheesePizza;
import com.zz.designmode.create.factory.pizza.LDPepperPizza;
import com.zz.designmode.create.factory.pizza.Pizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
