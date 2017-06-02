package com.hin.abstractFactory.object;

import com.hin.abstractFactory.absObject.Vehicle;

/**
 * 相当于ProductA2
 *
 * @author Administrator
 */
public class Plane extends Vehicle {

    public void run() {
        System.out.println("开飞机...");
    }
}
