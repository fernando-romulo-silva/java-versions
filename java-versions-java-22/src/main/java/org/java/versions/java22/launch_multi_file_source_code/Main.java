package org.java.versions.java22.launch_multi_file_source_code;

import static java.lang.System.out;

public class Main {

    // Since Java 11, we can execute Java programs consisting of just one file
    // directly without compiling them first.
    //
    // However, as soon as we add further Java files, the so-called “launch
    // single-file source code” mechanism from Java 11 no longer works.

    public static void main(String[] args) {
        out.println(Greetings.greet(args[0]));
    }

    // Let’s try again with Java 22:
    // $ java Hello.java World
    // Hello World!
}
