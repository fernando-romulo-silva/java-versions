package org.java.versions.java25.flexible_constructor_bodies;

import org.java.versions.java25.flexible_constructor_bodies.exam02.ChildClass;

public class Main {

    // Constructors in Java were long strictly limited in their structure: no custom
    // code was allowed before calling super(…) or this(…).
    //
    // This often led to sometimes cumbersome constructions – especially when
    // wanting to validate or pre-calculate parameters.

    public static void main(String[] args) {
        System.out.println();
        new ChildClass("bla bla").logCreation();
    }
}
