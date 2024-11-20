package org.java.versions.java19.new_system_properties_for_system_out_and_system_err;

import static java.lang.System.out;

public class Main {

    // Since version 18, Java automatically uses the character encoding of the
    // console or terminal for printing to System.out and System.err.
    //
    // On Linux, this is usually UTF-8 and on Windows, code page 437.

    public static void main(String[] args) {
        out.println("Á é ö ß € ¼");

        // If you start this on Linux, all characters will probably be displayed
        // correctly:
        // Á é ö ß € ¼
        //
        // However, if you run the program on Windows, you will most likely see the
        // following output (a question mark instead of the Á and € characters):
        // C:\...>java Test.java
        // ? é ö ß ? ¼

        //
        // If the automatic character set recognition does not work, you can set it to
        // UTF-8, for example, using the following VM options from Java 19 onwards:
        //
        // -Dstdout.encoding=utf8 -Dstderr.encoding=utf8
        //
        // If you don't want to do this every time you start the program, you can also
        // set these settings globally by defining the following environment variable
        // (yes, it begins with an underscore):
        //
        // _JAVA_OPTIONS="-Dstdout.encoding=utf8 -Dstderr.encoding=utf8"

    }

}
