package com.zz.designmode.structure.decorator.question1;

public class ComplexPhone extends PhoneDecorator{

    public ComplexPhone(CellPhone cellPhone) {
        super(cellPhone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("灯光闪烁提示");
    }
}
