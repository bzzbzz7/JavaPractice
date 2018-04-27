package com.zz.grammar.polymorphic1;

/**
 * Created by Administrator on 2017/6/9.
 */

class Child extends Father {
    protected int age;

    public Child() {
        age = 18;
    }

    @Override
    void eat() {
        System.out.println(age + "岁"  +"孩子在吃饭");
    }

}
