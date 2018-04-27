package com.yuneec.android.designmode;

class Base {
    public static void staticMethod() {
        System.out.println("Base staticMehtod");
    }

    public void dynamicMehtod() {
        System.out.println("Base dynamicMehtod");
    }
}

class Sub extends Base {
//    public static void staticMethod() {
//        System.out.println("Sub staticMehtod");
//    }

    public void dynamicMehtod() {
        System.out.println("Sub dynamicMehtod");
    }
}

public class TJ4 {
    public static void main(String args[]) {
//        Base c = new Sub();
//        c.staticMethod();
//        c.dynamicMehtod();
        Sub.staticMethod();
    }
}