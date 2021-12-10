package com.solid.ocp.objectOriented;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void translate(int x, int y) {}

    @Override
    void rotate(double angle) {}

    @Override
    void draw() {
        System.out.println("Drawing square -> " + this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
