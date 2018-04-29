package com.zz.designmode.structure.adapter.adapter;

import com.zz.designmode.structure.adapter.adapter.duck.Duck;
import com.zz.designmode.structure.adapter.adapter.duck.GreenHeadDuck;
import com.zz.designmode.structure.adapter.adapter.turkey.WildTurkey;


public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();

        WildTurkey turkey = new WildTurkey();

        Duck duck2turkeyAdapter = new TurkeyAdapter2();
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();

    }
}
