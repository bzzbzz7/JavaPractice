package com.zz.java.thinking.behavior.iterator.java;

import com.zz.java.thinking.behavior.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    private ArrayList<Iterator> iterators = new ArrayList<Iterator>();


    public Waitress() {

    }

    public void addIterator(Iterator iterator) {
        iterators.add(iterator);

    }

    public void printMenu() {
        Iterator iterator;
        MenuItem menuItem;
        for (int i = 0, len = iterators.size(); i < len; i++) {
            iterator = iterators.get(i);

            while (iterator.hasNext()) {
                menuItem = (MenuItem) iterator.next();
                System.out.println(menuItem.getName() + "***"
                        + menuItem.getPrice() + "***" + menuItem.getDescription());

            }


        }


    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVegetableMenu() {

    }
}
