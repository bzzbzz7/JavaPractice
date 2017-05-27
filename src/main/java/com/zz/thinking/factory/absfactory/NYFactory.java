package com.zz.thinking.factory.absfactory;

import com.zz.thinking.factory.pizza.NYCheesePizza;
import com.zz.thinking.factory.pizza.NYPepperPizza;
import com.zz.thinking.factory.pizza.Pizza;

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
