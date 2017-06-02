package com.hin.abstractFactory;

import com.hin.abstractFactory.absObject.Food;
import com.hin.abstractFactory.absObject.Vehicle;
import com.hin.abstractFactory.object.Plane;
import com.hin.abstractFactory.object.water;

/**
 * 第二个具体工厂
 * 相当于ConcreteFactory1
 * 生产“飞机”和“水”
 *
 * @author Administrator
 */
public class SecondFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }

    @Override
    public Food createFood() {
        return new water();
    }

}
