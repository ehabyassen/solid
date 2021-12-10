package com.solid.isp.after;

public class Square extends Shape {

    private double side;
    private DrawSquareStrategy drawSquareStrategy;

    public Square(double side, DrawSquareStrategy drawSquareStrategy) {
        this.side = side;
        this.drawSquareStrategy = drawSquareStrategy;
    }

    @Override
    void draw() {
        drawSquareStrategy.draw(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
