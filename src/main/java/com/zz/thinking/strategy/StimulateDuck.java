package com.zz.thinking.strategy;

import com.zz.thinking.strategy.duck.Duck;
import com.zz.thinking.strategy.duck.GreenHeadDuck;
import com.zz.thinking.strategy.duck.RedHeadDuck;
import com.zz.thinking.strategy.flybehavior.NoFlyBehavior;
import com.zz.thinking.strategy.quackbehavior.NoQuackBehavior;


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
