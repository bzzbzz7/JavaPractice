package com.zz.polymorphic.example1;

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

    void sleep(){
        System.out.println(age + "岁" + "父亲在睡觉");
    }
}
