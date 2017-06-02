package com.hin.abstractFactory;

import com.hin.abstractFactory.absObject.Food;
import com.hin.abstractFactory.absObject.Vehicle;
import com.hin.abstractFactory.object.Apple;
import com.hin.abstractFactory.object.Car;

/**
 * 第一个具体工厂
 * 相当于ConcreteFactory1
 * 生产“车”和“苹果”
 *
 * @author Administrator
 */
public class FirstFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }
}
