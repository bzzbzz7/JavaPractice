package com.zz.designmode.action.observer.question1;

public class Bee {

    public Bee(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println(this.getName() + "来采蜜");
    }

    public void sleep(){
        System.out.println(this.getName() + "回家睡觉");
    }
}
