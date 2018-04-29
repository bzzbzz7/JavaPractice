package com.zz.designmode.action.observer.question2;

import java.util.Observer;

public interface IRobot extends Observer {
    String getName();
    void up();
    void down();
    void left();
    void right();
}
