package com.zz.designmode.create.factory.question1.absfactory;

import com.zz.designmode.create.factory.question1.pizza.NYCheesePizza;
import com.zz.designmode.create.factory.question1.pizza.NYPepperPizza;
import com.zz.designmode.create.factory.question1.pizza.Pizza;

public class NYFactory implements AbsFactory {


    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;

    }

}
