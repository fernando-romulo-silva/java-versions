package org.java.versions.java25.flexible_constructor_bodies.exam02;

public class ChildClass extends SuperClass {
    private final String parameter;

    public ChildClass(String parameter) {
        this.parameter = parameter; // ⟵ 4.
        super(); // ⟵ 1.
    }

    @Override
    public void logCreation() {
        System.out.println("parameter = " + parameter); // ⟵ 3.
    }
}
