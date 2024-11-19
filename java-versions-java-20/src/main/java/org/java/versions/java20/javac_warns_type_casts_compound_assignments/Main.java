package org.java.versions.java20.javac_warns_type_casts_compound_assignments;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        // To warn developers about this potentially undesirable behavior, Java 20
        // (finally!) introduced a corresponding compiler warning.
        // There is no JDK enhancement proposal for this change.

        //
        short a = 30_000;
        int b = 50_000;
        a += b;

        // The program does not print 80000 (hexadecimal 0x13880), but 14464
        // (hexadecimal 0x3880).
        out.println("a = " + a);

        short c = 30_000;
        int d = 50_000;
        c = (short) (c + d); // old way
        out.println("c = " + c);
    }
}
