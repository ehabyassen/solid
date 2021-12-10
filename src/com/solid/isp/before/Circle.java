package com.solid.isp.before;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, DrawStrategy drawStrategy) {
        super(drawStrategy);
        this.radius = radius;
    }

    @Override
    void draw() {
        drawStrategy.draw(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
