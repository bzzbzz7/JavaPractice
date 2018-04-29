package com.zz.designmode.action.strategy;

import com.zz.designmode.action.strategy.duck.GreenHeadDuck;
import com.zz.designmode.action.strategy.duck.RedHeadDuck;
import com.zz.designmode.action.strategy.duck.Duck;
import com.zz.designmode.action.strategy.flybehavior.NoFlyBehavior;
import com.zz.designmode.action.strategy.quackbehavior.NoQuackBehavior;


public class StimulateDuck {

    public static void main(String[] args) {

        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.Fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.Fly();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.display();
        mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
        mRedHeadDuck.Fly();
        mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
        mRedHeadDuck.Quack();
    }

}
