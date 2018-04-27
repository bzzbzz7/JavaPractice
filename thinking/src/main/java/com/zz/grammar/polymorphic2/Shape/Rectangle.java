package com.zz.grammar.polymorphic2.Shape;

public class Rectangle extends Shape{
    protected float width;
    protected float height;

    public Rectangle(float width, float height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    protected void calcSize() {
        size = width * height;
    }
}
