package com.zz.designmode.action.observer.question1;

import java.util.ArrayList;
import java.util.List;

public class Flower {

    private List<Bee> bees;

    public Flower() {
    }

    public void addBee(Bee bee){
        if(bees == null){
            bees = new ArrayList<Bee>();
        }
        bees.add(bee);
    }

    public void flowerOpen(){
        for(Bee bee : bees){
            bee.work();
        }
    }

    public void flowerClose(){
        for(Bee bee : bees){
            bee.sleep();
        }
    }
}
