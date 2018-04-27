package com.zz.java.thinking.struct.adapter.adapter;

import com.zz.java.thinking.struct.adapter.duck.Duck;
import com.zz.java.thinking.struct.adapter.turkey.WildTurkey;

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
