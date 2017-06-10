package com.zz.java.grammar.polymorphic;

/**
 * Created by Administrator on 2017/6/9.
 */

class Father {
    protected int age;

    public Father(){
        age = 40;
    }
    void eat(){
        System.out.println(age + "岁" + "父亲在吃饭");
    }
    void info(){
        System.out.println("父亲岁数是：" + age);
    }
}
