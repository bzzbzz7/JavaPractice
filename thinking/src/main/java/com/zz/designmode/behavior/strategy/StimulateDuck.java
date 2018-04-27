package com.zz.designmode.behavior.strategy;

import com.zz.designmode.behavior.strategy.duck.GreenHeadDuck;
import com.zz.designmode.behavior.strategy.duck.RedHeadDuck;
import com.zz.designmode.behavior.strategy.duck.Duck;
import com.zz.designmode.behavior.strategy.flybehavior.NoFlyBehavior;
import com.zz.designmode.behavior.strategy.quackbehavior.NoQuackBehavior;


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
