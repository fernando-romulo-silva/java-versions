package org.java.versions.java17.sealed_classes;

import static java.lang.System.out;

public class Main {

    // A sealed class or interface can be extended or implemented only by those
    // classes and interfaces permitted to do so.
    static sealed interface Color permits Red, Blue, Green {
    }

    static final class Red implements Color {
    }

    static final class Blue implements Color {
    }

    static non-sealed class Green implements Color {
    }

    static class DarkGreen extends Green {

    }

    // However, if the outer class is sealed, the local class may not inherit from
    // it:
    //
    // public final class Shape implements Color {}

    // Sealing allows classes and interfaces to have more control over their
    // permitted subtypes;
    //
    // this is useful both for general domain modeling and for building more secure
    // platform libraries.

    public static void test01() {

        final Color color = new Red();

        // final String code = switch (color) {
        // case Red red -> "I";
        // case Blue blue -> "P";
        // case Green green -> "P";
        // };

        if (color instanceof Red red) {
            // compiler has already cast shape to Circle for us, and bound it to c
            out.printf("Color " + red);
        }
    }
}
