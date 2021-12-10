package com.solid.isp.after;

public class DrawCircleStrategyA implements DrawCircleStrategy {

    @Override
    public void draw(Circle circle) {
        System.out.println("Drawing circle -> " + circle + " with strategy A.");
    }
}
