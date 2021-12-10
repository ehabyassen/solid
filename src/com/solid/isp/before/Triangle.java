package com.solid.isp.before;

public class Triangle extends Shape {

    private int side1, side2, side3;

    public Triangle(int side1, int side2, int side3, DrawStrategy drawStrategy) {
        super(drawStrategy);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    void draw() {
        drawStrategy.draw(this);
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
