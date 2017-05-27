package com.zz.thinking.factory.absfactory;

import com.zz.thinking.factory.pizza.Pizza;

public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
