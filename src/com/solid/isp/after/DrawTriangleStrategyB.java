package com.solid.isp.after;

public class DrawTriangleStrategyB implements DrawTriangleStrategy {

    @Override
    public void draw(Triangle triangle) {
        System.out.println("Drawing triangle " + triangle + " using strategy B.");
    }
}
