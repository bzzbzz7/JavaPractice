package com.zz.grammar.polymorphic2.Shape;

public class Circle extends Shape{
    protected float radius;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    protected void calcSize() {
        size = (float) (Math.PI * radius*radius);
    }
}
