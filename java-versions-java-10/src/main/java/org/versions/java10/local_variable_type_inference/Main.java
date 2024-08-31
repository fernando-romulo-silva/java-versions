package org.versions.java10.local_variable_type_inference;

public class Main {

    public static void main(String[] args) {
        // Until Java 9, we had to mention the type of the local variable explicitly and
        // ensure it was compatible with the initializer used to initialize it:

        String message01 = "Hello!";

        // In Java 10, this is how we could declare a local variable:
        var message10 = "Hello, Java 10";
    }

}
