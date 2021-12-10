package com.solid.ocp.objectOriented;

import java.util.Collection;

public class Drawing {

    void draw(Collection<Shape> shapes) {
        shapes.forEach(Shape::draw);
    }
}
