package com.zz.designmode.action.observer.question2;

import java.util.Observable;

public class RemoteControl extends Observable {

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

}
