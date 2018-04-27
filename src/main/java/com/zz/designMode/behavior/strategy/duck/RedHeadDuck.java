package com.zz.java.thinking.behavior.strategy.duck;

import com.zz.java.thinking.behavior.strategy.flybehavior.BadFlyBehavior;
import com.zz.java.thinking.behavior.strategy.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("**RedHead**");
    }

}
