package com.zz.designmode.behavior.observer.question2;

import java.util.Observer;

public interface IRobot extends Observer {
    String getName();
    void up();
    void down();
    void left();
    void right();
}
