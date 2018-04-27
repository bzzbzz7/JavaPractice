package com.zz.java.thinking.create.factory.absfactory;

import com.zz.java.thinking.create.factory.pizza.NYCheesePizza;
import com.zz.java.thinking.create.factory.pizza.NYPepperPizza;
import com.zz.java.thinking.create.factory.pizza.Pizza;

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
