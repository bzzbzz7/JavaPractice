package com.zz.designmode.behavior.observer.question2;

import java.util.Observable;

public class RemoteControl extends Observable {

    private IRobot robot;

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    public void setRobot(IRobot robot) {
        this.robot = robot;
    }

    public void operaDone(){
        System.out.println(robot.getName() + "操作执行完成！");
    }
}
