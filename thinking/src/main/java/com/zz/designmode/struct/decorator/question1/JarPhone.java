package com.zz.designmode.struct.decorator.question1;

public class JarPhone extends PhoneDecorator{
    public JarPhone(CellPhone cellPhone) {
        super(cellPhone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("震动提示");
    }
}
