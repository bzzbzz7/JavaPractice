package com.zz.designmode.create.factory.question2;

public class AndroidGameFactory implements GameFactory {

    @Override
    public OperationController createOperationFactory() {
        return new AndroidOperation();
    }

    @Override
    public InterfaceContoller createInterfaceFactory() {
        return new AndroidInterface();
    }
}
