package com.zz.grammar.question0;

public class Sub extends Base {
    int x = 30;//5

    public Sub() {  //1
        this.printMessage();//6
        x = 40;
    }

    public void printMessage(){
        System.out.println("Sub.x:" + x);
    }
}
