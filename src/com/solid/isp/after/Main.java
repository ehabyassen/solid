package com.solid.isp.after;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(5, new DrawCircleStrategyA());
        Circle c2 = new Circle(3, new DrawCircleStrategyB());
        Square s1 = new Square(9, new DrawSquareStrategyB());

        c1.draw();
        c2.draw();
        s1.draw();
    }
}
