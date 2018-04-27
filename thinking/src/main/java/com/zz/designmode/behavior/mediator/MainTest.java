package com.zz.designmode.behavior.mediator;

public class MainTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm mAlarm = new Alarm(mediator, Alarm.class.getSimpleName());
        CoffeeMachine mCoffeeMachine = new CoffeeMachine(mediator, CoffeeMachine.class.getSimpleName());
        Curtains mCurtains = new Curtains(mediator, Curtains.class.getSimpleName());
        TV mTV = new TV(mediator, TV.class.getSimpleName());
        mAlarm.SendAlarm(0);
        mCoffeeMachine.FinishCoffee();
        mAlarm.SendAlarm(1);
    }

}
