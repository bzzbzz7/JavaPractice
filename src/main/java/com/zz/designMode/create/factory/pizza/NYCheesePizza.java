package com.zz.java.thinking.create.factory.pizza;

public class NYCheesePizza extends Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        super.setname("NYCheesePizza");

        System.out.println(name + " preparing;");
    }

}
