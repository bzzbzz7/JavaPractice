package com.zz.thinking.factory.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        super.setname("CheesePizza");

        System.out.println(name + " preparing;");
    }

}
