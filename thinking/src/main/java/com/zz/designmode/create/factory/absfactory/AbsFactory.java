package com.zz.designmode.create.factory.absfactory;

import com.zz.designmode.create.factory.pizza.Pizza;

public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
