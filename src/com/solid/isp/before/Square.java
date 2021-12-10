package com.solid.isp.before;

public class Square extends Shape {

    private double side;

    public Square(double side, DrawStrategy drawStrategy) {
        super(drawStrategy);
        this.side = side;
    }

    @Override
    void draw() {
        drawStrategy.draw(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
