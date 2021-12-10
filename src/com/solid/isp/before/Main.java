package com.solid.isp.before;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(4, new DrawStrategyA());
        Circle c2 = new Circle(5, new DrawStrategyB());
        Square s1 = new Square(3, new DrawStrategyA());
        Triangle t1 = new Triangle(1, 2, 3, new DrawStrategyB());

        c1.draw();
        c2.draw();
        s1.draw();
        t1.draw();
    }
}
