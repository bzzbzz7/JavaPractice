package com.hin.abstractFactory.object;

import com.hin.abstractFactory.absObject.Vehicle;

/**
 * 相当于ProductA1
 *
 * @author Administrator
 */
public class Car extends Vehicle {

    public void run() {
        System.out.println("开车...");
    }
}
