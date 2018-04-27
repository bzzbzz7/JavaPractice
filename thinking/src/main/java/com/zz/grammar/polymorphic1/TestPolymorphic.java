package com.zz.grammar.polymorphic1;

/**
 * Created by Administrator on 2017/6/9.
 */

public class TestPolymorphic {
    public static void main(String[] args){
        Father c1 = new Child();
        c1.eat();
        c1.sleep();
        System.out.println("年龄：" + c1.age);

        Child c2 = new Child();
        c2.eat();
        c2.sleep();
        System.out.println("年龄：" + c2.age);
    }
}
