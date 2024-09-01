package org.java.versions.java08.default_method;

interface Shape {

    // A default method was introduced in Java 8 to support backward compatibility.
    // This basically means a new method definition can be added to an interface and
    // all the classes implementing this interface may or may not override the
    // default method.
    default void printShapeType(String type) {
        System.out.println("The shape is : " + type);
    }
}
