package org.java.versions.record_patterns;

public class RecordPatterns2 {

    
    record Point(int x, int y) {}

    static void printSumWithoutPatternMatching(Object obj) {
        
	// old way
	if (obj instanceof Point p) {
            int x = p.x();
            int y = p.y();
            System.out.println(x+y);
        }
    }

    static void printSumWithPatternMatching(Object obj) {
	
        if (obj instanceof Point(int x, int y)) {
            
            // you can access the x an y, like descontrunstructors JS
            System.out.println(x+y);
        }
    }
}
