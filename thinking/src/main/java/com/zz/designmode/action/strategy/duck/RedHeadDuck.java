package com.zz.designmode.action.strategy.duck;

import com.zz.designmode.action.strategy.flybehavior.BadFlyBehavior;
import com.zz.designmode.action.strategy.quackbehavior.GeGeQuackBehavior;

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
