package com.zz.designmode.create.factory.question1.simplefactory;


public class PizzaStroe {
    public static void main(String[] args) {
        SimplePizzaFactory mSimplePizzaFactory;
        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new SimplePizzaFactory());

    }


}
