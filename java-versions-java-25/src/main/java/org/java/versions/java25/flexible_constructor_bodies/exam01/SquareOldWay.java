package org.java.versions.java25.flexible_constructor_bodies.exam01;

public class SquareOldWay extends Rectangle {

    public SquareOldWay(Color color, int area) {
        this(color, Math.sqrt(validateArea(area)));
    }

    private static double validateArea(int area) {
        if (area < 0)
            throw new IllegalArgumentException();
        return area;
    }

    private SquareOldWay(Color color, double sideLength) {
        super(color, sideLength, sideLength);
    }
}
