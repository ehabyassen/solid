package com.solid.ocp.procedural;

import java.util.Collection;

import static com.solid.ocp.procedural.ShapeType.circle;
import static com.solid.ocp.procedural.ShapeType.square;

public class Drawing {

    void draw(Collection<Shape> shapes) {
        shapes.forEach(shape -> {
            if (shape.getShapeType().equals(circle)) {
                ((Circle) shape).draw();
            } else if (shape.getShapeType().equals(square)) {
                ((Square) shape).draw();
            }
        });
    }
}
