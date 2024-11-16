package org.java.versions.java17.hex_formatting_parsing_utility;

import static java.lang.System.out;

public class Main {

    // To print hexadecimal numbers, we could previously use the toHexString()
    // method of the Integer, Long, Float, and Double classes – or String.format().
    // The following code shows a few examples:
    public static void main(String[] args) {

        out.println(Integer.toHexString(1_000));
        out.println(Long.toHexString(100_000_000_000L));
        out.println(Float.toHexString(3.14F));
        out.println(Double.toHexString(3.14159265359));

        out.println(
                "%x - %x - %a - %a".formatted(1_000, 100_000_000_000L, 3.14F, 3.14159265359));
    }

}
