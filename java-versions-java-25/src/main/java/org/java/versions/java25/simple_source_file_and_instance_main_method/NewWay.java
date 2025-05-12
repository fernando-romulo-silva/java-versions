package org.java.versions.java25.simple_source_file_and_instance_main_method;

import static java.lang.System.out;

//public class NewWay {

    // java --enable-preview NewWay.java
    //
    // First, we allow main methods to omit the infamous boilerplate of public
    // static void main(String[] args), which simplifies the Hello, World! program
    // to:

    void main() {
        out.println("Hello, World");
    }
// }
