package com.solid.isp.after;

public class Triangle extends Shape {

    private double side1, side2, side3;

    private DrawTriangleStrategy drawTriangleStrategy;

    public Triangle(double side1, double side2, double side3, DrawTriangleStrategy drawTriangleStrategy) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.drawTriangleStrategy = drawTriangleStrategy;
    }

    @Override
    void draw() {
        drawTriangleStrategy.draw(this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
