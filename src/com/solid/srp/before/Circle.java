package com.solid.srp.before;

import java.util.Arrays;

public class Circle {

    private double radius;
    private int[] center;

    public Circle(double radius, int[] center) {
        this.radius = radius;
        this.center = center;
    }

    void translate(int x, int y) {
    }

    void rotate(double angle) {
    }

    void draw(Screen screen) {
        screen.draw(this);
    }

    void draw(Printer printer) {
        printer.print(this);
    }

    void serialize(Serializer serializer) {
        serializer.serialize(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int[] getCenter() {
        return center;
    }

    public void setCenter(int[] center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + Arrays.toString(center) +
                '}';
    }
}
