package com.zz.designmode.create.factory.question2;

public class Test {
    public static void main(String[] args){
        GameFactory factory = new AndroidGameFactory();
        OperationController operationController = factory.createOperationFactory();
        InterfaceContoller interfaceContoller = factory.createInterfaceFactory();
        operationController.operate();
        interfaceContoller.display();
    }
}
