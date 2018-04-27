package com.zz.grammar.polymorphic2.Printer;

import com.zz.grammar.polymorphic2.Shape.Shape;

public abstract class Printer {
    protected String name;

    public Printer(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void doPrint(Shape s){
        System.out.println(getName() + " is printing: " + s.getName());
    }
}
