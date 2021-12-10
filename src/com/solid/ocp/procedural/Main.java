package com.solid.ocp.procedural;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(4.5, new int[] {3, 2});
        Circle c2 = new Circle(7, new int[] {3, 2});
        Square s1 = new Square(6);

        Drawing drawing = new Drawing();
        drawing.draw(List.of(c1, s1, c2));
    }
}
