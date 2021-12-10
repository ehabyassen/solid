package com.solid.isp.before;

public interface DrawStrategy {

    void draw(Circle circle);
    void draw(Square square);
    void draw(Triangle triangle);
}
