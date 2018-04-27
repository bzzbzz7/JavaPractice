package com.hin.observer;

/**
 * 观察者2
 *
 * @author Administrator
 */
public class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
