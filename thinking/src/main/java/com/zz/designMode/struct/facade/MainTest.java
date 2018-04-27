package com.zz.java.thinking.struct.facade;

import com.zz.java.thinking.struct.facade.hometheater.HomeTheaterFacade;


public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
