package com.zz.designmode.action.strategy.duck;

import com.zz.designmode.action.strategy.flybehavior.GoodFlyBehavior;
import com.zz.designmode.action.strategy.quackbehavior.GaGaQuackBehavior;

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