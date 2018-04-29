package com.zz.designmode.structure.decorator.question1;

public class PhoneDecorator extends CellPhone{
    CellPhone cellPhone;
    public PhoneDecorator(CellPhone cellPhone) {
        if(cellPhone!=null){
            this.cellPhone = cellPhone;
        }else{
            this.cellPhone = new SimplePhone();
        }
    }

    @Override
    public void receiveCall() {
        cellPhone.receiveCall();
    }
}
