package com.zz.designmode.behavior.strategy.duck;

import com.zz.designmode.behavior.strategy.flybehavior.GoodFlyBehavior;
import com.zz.designmode.behavior.strategy.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("**GreenHead**");
    }

}