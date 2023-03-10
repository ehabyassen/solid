package com.solid.isp.after;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(5, new DrawCircleStrategyA());
        Circle c2 = new Circle(3, new DrawCircleStrategyB());
        Square s1 = new Square(9, new DrawSquareStrategyB());
        Triangle t1 = new Triangle(3, 4, 5, new DrawTriangleStrategyB());

        c1.draw();
        c2.draw();
        s1.draw();
        t1.draw();
    }
}
