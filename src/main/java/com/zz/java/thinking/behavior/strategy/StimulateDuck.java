package com.zz.java.thinking.behavior.strategy;

import com.zz.java.thinking.behavior.strategy.duck.GreenHeadDuck;
import com.zz.java.thinking.behavior.strategy.duck.RedHeadDuck;
import com.zz.java.thinking.behavior.strategy.duck.Duck;
import com.zz.java.thinking.behavior.strategy.flybehavior.NoFlyBehavior;
import com.zz.java.thinking.behavior.strategy.quackbehavior.NoQuackBehavior;


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
