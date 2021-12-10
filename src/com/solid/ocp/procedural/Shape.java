package com.solid.ocp.procedural;

public abstract class Shape {

    private final ShapeType shapeType;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    abstract void translate(int x, int y);

    abstract void rotate(double angle);

    public ShapeType getShapeType() {
        return shapeType;
    }
}
