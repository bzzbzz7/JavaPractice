package com.zz.grammar.polymorphic2.Shape;

public abstract class Shape {
    protected float size;
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    protected abstract void calcSize();

    public String getSize(){
        calcSize();
        return String.valueOf(size);
    }
}
