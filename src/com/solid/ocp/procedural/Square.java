package com.solid.ocp.procedural;

import static com.solid.ocp.procedural.ShapeType.square;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super(square);
        this.side = side;
    }

    @Override
    void translate(int x, int y) {}

    @Override
    void rotate(double angle) {}

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
