package com.zz.thinking.strategy.duck;

import com.zz.thinking.strategy.flybehavior.BadFlyBehavior;
import com.zz.thinking.strategy.quackbehavior.GeGeQuackBehavior;

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
