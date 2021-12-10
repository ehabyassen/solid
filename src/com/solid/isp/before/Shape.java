package com.solid.isp.before;

public abstract class Shape {

    protected DrawStrategy drawStrategy;

    public Shape(DrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }

    abstract void draw();
}
