package com.zz.grammar.question0;

public class Base {
    int x = 10;//3

    public Base() { //2
        this.printMessage();//4
        this.x = 20;
    }

    public void printMessage(){
        System.out.println("Base.x:" + x);
    }
}
