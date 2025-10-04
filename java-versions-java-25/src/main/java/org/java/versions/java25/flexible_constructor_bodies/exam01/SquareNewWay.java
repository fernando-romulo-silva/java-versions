package org.java.versions.java25.flexible_constructor_bodies.exam01;

public class SquareNewWay extends Rectangle {

    public SquareNewWay(Color color, int area) {
        if (area < 0) { // code before the super constructor
            throw new IllegalArgumentException();
        }
        double sideLength = Math.sqrt(area);
        super(color, sideLength, sideLength);
    }
}
