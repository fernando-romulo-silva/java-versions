package org.java.versions.java25.flexible_constructor_bodies.exam02;

public class SuperClass {
    public SuperClass() {
        logCreation(); // ⟵ 2.
    }

    public void logCreation() {
        System.out.println("SuperClass created"); // ⟵ not invoked;
                                                  // method is overriden in ChildClass
    }
}
