package com.hin.abstractFactory.object;

import com.hin.abstractFactory.absObject.Food;

/**
 * 相当于ProductB1
 *
 * @author Administrator
 */
public class water extends Food {

    public void eat() {
        System.out.println("喝着水...");
    }
}
