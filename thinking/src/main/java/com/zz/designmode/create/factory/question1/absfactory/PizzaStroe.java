package com.zz.designmode.create.factory.question1.absfactory;


public class PizzaStroe {
    public static void main(String[] args) {

        OrderPizza mOrderPizza;
        mOrderPizza = new OrderPizza(new LDFactory());

    }


}
