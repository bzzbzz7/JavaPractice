package com.zz.designmode.create.factory.question1.absfactory;

import com.zz.designmode.create.factory.question1.pizza.Pizza;

public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
