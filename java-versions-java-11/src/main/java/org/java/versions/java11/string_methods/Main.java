package org.java.versions.java11.string_methods;

import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        // Java 11 adds a few new methods to the String class:
        // isBlank, lines, strip, stripLeading, stripTrailing, and repeat.

        final var multilineString = "Baeldung helps \n \n developers \n explore Java.";

        final var lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        System.out.println(lines);

    }

}
