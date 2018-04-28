package com.zz.designmode.struct.decorator.question1;

public class Test {
    public static void main(String[] args) {
        CellPhone p1 = new SimplePhone();
        p1.receiveCall();
        System.out.println();
        CellPhone p2 = new JarPhone(p1);
        p2.receiveCall();
        System.out.println();
        CellPhone p3 = new ComplexPhone(p2);
        p3.receiveCall();
    }
}
