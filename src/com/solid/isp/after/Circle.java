package com.solid.isp.after;

public class Circle extends Shape {

    private double radius;
    private DrawCircleStrategy drawCircleStrategy;

    public Circle(double radius, DrawCircleStrategy drawCircleStrategy) {
        this.radius = radius;
        this.drawCircleStrategy = drawCircleStrategy;
    }

    @Override
    void draw() {
        drawCircleStrategy.draw(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
