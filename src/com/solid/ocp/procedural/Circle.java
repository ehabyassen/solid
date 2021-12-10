package com.solid.ocp.procedural;

import java.util.Arrays;

import static com.solid.ocp.procedural.ShapeType.circle;

public class Circle extends Shape {

    private double radius;
    private int[] center;

    public Circle(double radius, int[] center) {
        super(circle);
        this.radius = radius;
        this.center = center;
    }

    @Override
    void translate(int x, int y) {}

    @Override
    void rotate(double angle) {}

    void draw() {
        System.out.println("Drawing circle -> " + this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + Arrays.toString(center) +
                '}';
    }
}
