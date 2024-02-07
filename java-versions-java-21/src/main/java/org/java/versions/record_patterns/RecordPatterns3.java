package org.java.versions.record_patterns;

public class RecordPatterns3 {

    enum Color { RED, GREEN, BLUE }
    
    record Point(int x, int y) {}
    
    record ColoredPoint(Point p, Color c) {}
    
    record Rectangle(ColoredPoint upperLeft, ColoredPoint lowerRight) {}


    static void printColorOfUpperLeftPoint(Rectangle r) {
        
	if (r instanceof Rectangle(ColoredPoint(Point p, Color c), ColoredPoint lr)) {
            System.out.println(c);
        }
    }
}
