package com.zz.designmode.struct.facade;

import com.zz.designmode.struct.facade.hometheater.HomeTheaterFacade;


public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
