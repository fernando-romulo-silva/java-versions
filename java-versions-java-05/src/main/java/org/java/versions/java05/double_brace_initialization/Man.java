package org.java.versions.java05.double_brace_initialization;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Man {

    // The combination of two separate processes in Java is known as Double Brace
    // Initialization in
    // Java. As the name suggests, there are two braces {{ included in it.
    //
    // A single brace { is nothing new for programmers.
    // The first brace in the double brace initialization is used to create an
    // anonymous inner class.
    //
    // We have made many anonymous inner classes in such a way.
    // The second brace is what makes it different from the normal braces in Java.
    //
    // The second brace is the initialization block which is used with the declared
    // anonymous inner class.
    //
    // When this initialization block is used with the anonymous inner class, it is
    // known as Java double brace initialization.

    public static void main(String[] args) {

        // Creating an empty HashSet
        Set<String> sets = new HashSet<String>()

        // Double brace
        {
            {
                // Adding elements to above HashSet
                // This is double brace initialization
                add("one");
                add("two");
                add("three");
            }
        };

        // ...
        // Now pass above collection as parameter to method
        // Calling method 2 inside main() method
        out.println(sets);
    }
}
