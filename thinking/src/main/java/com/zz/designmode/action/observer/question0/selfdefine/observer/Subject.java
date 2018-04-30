package com.zz.designmode.action.observer.question0.selfdefine.observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
