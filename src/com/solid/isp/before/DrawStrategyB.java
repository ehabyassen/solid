package com.solid.isp.before;

public class DrawStrategyB implements DrawStrategy {

    @Override
    public void draw(Circle circle) {
        System.out.println("Drawing circle -> " + circle + " with strategy B.");
    }

    @Override
    public void draw(Square square) {
        System.out.println("Drawing square -> " + square + " with strategy B.");
    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println("Drawing triangle -> " + triangle + " with strategy B.");
    }
}
