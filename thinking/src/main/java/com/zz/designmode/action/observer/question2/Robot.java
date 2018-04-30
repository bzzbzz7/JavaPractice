package com.zz.designmode.action.observer.question2;

import java.util.Observable;

public class Robot implements IRobot {

    private RemoteControl remoteControl;

    private String name;

    public Robot(RemoteControl remoteControl, String name) {
        this.remoteControl = remoteControl;
        this.name = name;
        this.remoteControl.addObserver(this);
    }

    public Robot(RemoteControl remoteControl) {
        this(remoteControl, "Robot");
    }

    public String getName() {
        return this.name;
    }

    public void up() {
        System.out.println(name + "向前走10m");
    }

    public void down() {
        System.out.println(name + "向下走10m");
    }

    public void left() {
        System.out.println(name + "向左走10m");
    }

    public void right() {
        System.out.println(name + "向右走10m");
    }

    @Override
    public  void update(Observable o, Object arg) {
        Character option = (Character) arg;

        switch (option){
            case 'w':this.up();break;
            case 's':this.down();break;
            case 'a':this.left();break;
            case 'd':this.right();break;
        }
    }
}
