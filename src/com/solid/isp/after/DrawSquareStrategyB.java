package com.solid.isp.after;

public class DrawSquareStrategyB implements DrawSquareStrategy {

    @Override
    public void draw(Square square) {
        System.out.println("Drawing square -> " + square + " with strategy B.");
    }
}
