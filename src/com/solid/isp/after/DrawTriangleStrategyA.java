package com.solid.isp.after;

public class DrawTriangleStrategyA implements DrawTriangleStrategy {

    @Override
    public void draw(Triangle triangle) {
        System.out.println("Drawing triangle " + triangle + " using strategy A.");
    }
}
