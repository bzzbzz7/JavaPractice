package com.zz.java.thinking.create.factory.pizza;

public class ChinesePizza extends Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        super.setname("ChinesePizza");

        System.out.println(name + " preparing;");
    }

}
