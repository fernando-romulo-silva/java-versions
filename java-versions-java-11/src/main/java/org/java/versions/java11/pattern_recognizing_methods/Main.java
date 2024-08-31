package org.java.versions.java11.pattern_recognizing_methods;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // asMatchPredicate(): This method is similar to Java 8 method asPredicate().
        // Introduced in JDK 11, this method will create a predicate if the pattern
        // matches with the input string.

        var str = Pattern.compile("aba").asMatchPredicate();

        str.test("aabb"); // false

        str.test("aba"); // true
    }

}
