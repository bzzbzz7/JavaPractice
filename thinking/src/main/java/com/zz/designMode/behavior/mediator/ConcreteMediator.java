package com.zz.java.thinking.behavior.mediator;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        // TODO Auto-generated method stub
        colleagueMap.put(colleagueName, colleague);
    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        // TODO Auto-generated method stub

        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(CoffeeMachine.class.getSimpleName()))).StartCoffee();
                ((TV) (colleagueMap.get(TV.class.getSimpleName()))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(TV.class.getSimpleName()))).StopTv();
            }

        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(Curtains.class.getSimpleName()))).UpCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
        }

    }

    @Override
    public void SendMessage() {
        // TODO Auto-generated method stub

    }

}
