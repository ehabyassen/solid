package com.solid.isp.after;

public class DrawSquareStrategyA implements DrawSquareStrategy {

    @Override
    public void draw(Square square) {
        System.out.println("Drawing square -> " + square + " with strategy A.");
    }
}
