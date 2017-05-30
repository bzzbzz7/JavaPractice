package com.zz.thinking.apperance;

import com.zz.thinking.apperance.hometheater.HomeTheaterFacade;


public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
