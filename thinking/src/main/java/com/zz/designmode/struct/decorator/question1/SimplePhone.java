package com.zz.designmode.struct.decorator.question1;

public class SimplePhone extends CellPhone{

    @Override
    public void receiveCall() {
        System.out.println("声音提示");
    }
}
