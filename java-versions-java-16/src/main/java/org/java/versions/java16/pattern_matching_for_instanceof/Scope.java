package org.java.versions.java16.pattern_matching_for_instanceof;

import static java.lang.System.out;

public class Scope {

    private String s = "Hello, world!";

    private void processObject(Object obj) {

        out.println(s); // Prints "Hello, world!"

        if (obj instanceof String s) {
            out.println(s); // Prints "Happy Coding!"
            out.println(this.s); // Prints "Hello, world!"
        }

        if (obj instanceof String s && s.length() > 5) {
            s = s.toUpperCase(); // Compiler error in Java 15, allowed in Java 16
            out.println(s);
        } else if (obj instanceof Integer i) {
            i = i * i; // Compiler error in Java 15, allowed in Java 16
            out.println(i);
        }
    }

    public static void main(String[] args) {
        new Scope().processObject("Happy Coding!");
    }

}
