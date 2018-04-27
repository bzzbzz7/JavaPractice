package com.zz.java.thinking.create.factory.absfactory;

import com.zz.java.thinking.create.factory.pizza.Pizza;

public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
