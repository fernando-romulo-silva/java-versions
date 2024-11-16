package org.java.versions.java17.system_property_native_character_encoding;

import static java.lang.System.out;

class Main {

    // From Java 17 onwards, you can use the system property "native.encoding" to
    // retrieve the operating system's default character encoding:

    public static void main(String[] args) {
        out.println("native encoding: " + System.getProperty("native.encoding"));
    }

}
