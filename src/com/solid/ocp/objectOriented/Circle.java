package com.solid.ocp.objectOriented;

import java.util.Arrays;

public class Circle extends Shape {

    private double radius;
    private int[] center;

    public Circle(double radius, int[] center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    void translate(int x, int y) {}

    @Override
    void rotate(double angle) {}

    @Override
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
