package com.zz.designmode.behavior.observer.question2;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        new Test().start();
    }

    protected void start() throws IOException {

        //一个遥控器（Observable）
        RemoteControl control = new RemoteControl();
        //多个机器人
        IRobot redRobot = new Robot(control,"红色小强机器人");
        IRobot blackRobot = new Robot(control,"黑色小强机器人");
        IRobot whiteRobot = new Robot(control,"白色小强机器人");

        control.addObserver(redRobot);
        control.addObserver(blackRobot);
        control.addObserver(whiteRobot);

        while (true){
            char option = (char) System.in.read();
            control.setChanged();
            control.notifyObservers(option);
        }
    }
}
