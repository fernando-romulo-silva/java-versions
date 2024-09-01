package org.java.versions.java08.static_reference_method;

interface Shape {

    // The static method printArea() is only available in an interface.
    // Note that this cannot be overridden by any implementing class.
    static void printArea(float result) {
        System.out.println("Calculated Area : " + result);
    }
}
