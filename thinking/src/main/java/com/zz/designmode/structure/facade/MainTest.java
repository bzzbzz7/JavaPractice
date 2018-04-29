package com.zz.designmode.structure.facade;

import com.zz.designmode.structure.facade.hometheater.HomeTheaterFacade;


public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
