package com.zz.java.grammar.polymorphic;

/**
 * Created by Administrator on 2017/6/9.
 */

public class TestPolymorphic {
    public static void main(String[] args){
        Father c = new Child();
        c.eat();
        //c.play();
        System.out.println("年龄：" + c.age);

        Child c2 = new Child();
        c2.info();
    }
}
