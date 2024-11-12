package org.java.versions.java21.record_patterns;

import static java.lang.System.out;

public class RecordPatterns2 {

    record Point(int x, int y) {
    }

    static void printSumWithoutPatternMatching(Object obj) {

        // old way
        if (obj instanceof Point p) {
            int x = p.x();
            int y = p.y();
            out.println(x + y);
        }
    }

    static void printSumWithPatternMatching(Object obj) {

        if (obj instanceof Point(var x, var y)) {

            // you can access the x an y, like descontrunstructors JS
            out.println(x + y);
        }
    }
}
