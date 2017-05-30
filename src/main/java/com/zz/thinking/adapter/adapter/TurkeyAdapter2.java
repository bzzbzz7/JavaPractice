package com.zz.thinking.adapter.adapter;

import com.zz.thinking.adapter.Duck;
import com.zz.thinking.adapter.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        super.gobble();
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        super.fly();
        super.fly();
        super.fly();
    }
}
