package org.java.versions.record_patterns;

import static java.lang.System.out;

class RecordPatterns3 {

    enum Color {
        RED, GREEN, BLUE
    }

    record Point(int x, int y) {
    }

    record ColoredPoint(Point p, Color c) {
    }

    record Rectangle(ColoredPoint upperLeft, ColoredPoint lowerRight) {
    }

    static void printColorOfUpperLeftPoint(Rectangle r) {

        if (r instanceof Rectangle(ColoredPoint(Point p, Color c), ColoredPoint lr)) {
            out.println(p);
            out.println(c);
            out.println(lr);
        }

        // or

        if (r instanceof Rectangle(ColoredPoint(var p, var c), var lr)) {
            out.println(p);
            out.println(c);
            out.println(lr);
        }

    }

}
