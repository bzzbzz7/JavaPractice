package com.zz.java.grammar.polymorphic;

/**
 * Created by Administrator on 2017/6/9.
 */

class Child extends Father {
    protected int age = 18;

    public Child() {
        age = 18;
    }

    @Override
    void eat() {
        System.out.println("孩子在吃饭");
    }

    void play(){
        System.out.println("孩子在打CS");
    }
}
