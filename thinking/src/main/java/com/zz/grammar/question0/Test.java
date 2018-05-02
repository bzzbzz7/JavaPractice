package com.zz.grammar.question0;

public class Test {
    public static void main(String[] args){
        Base b=new Sub();
        System.out.println(b.x);
        Sub c=(Sub)b;
        System.out.println(c.x);
    }
}
