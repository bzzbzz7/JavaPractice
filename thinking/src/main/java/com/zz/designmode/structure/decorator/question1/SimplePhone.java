package com.zz.designmode.structure.decorator.question1;

public class SimplePhone extends CellPhone{

    @Override
    public void receiveCall() {
        System.out.println("声音提示");
    }
}
