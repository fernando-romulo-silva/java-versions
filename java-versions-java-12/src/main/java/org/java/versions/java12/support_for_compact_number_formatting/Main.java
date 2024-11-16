package org.java.versions.java12.support_for_compact_number_formatting;

import static java.lang.System.out;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    // Using the static method NumberFormat.getCompactNumberInstance(), we can
    // create a formatter for the so-called "compact number formatting".

    // This is a form that is easy for humans to read, such as "2M" or "3 billion".

    // The following example shows how some numbers are displayed – once in the
    // short and once in the long compact form:

    public static void main(String[] args) {
        NumberFormat nfShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat nfLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        out.println("        1,000 short -> " + nfShort.format(1_000));
        out.println("      456,789 short -> " + nfShort.format(456_789));
        out.println("    2,000,000 short -> " + nfShort.format(2_000_000));
        out.println("3,456,789,000 short -> " + nfShort.format(3_456_789_000L));
        out.println();
        out.println("        1,000 long -> " + nfLong.format(1_000));
        out.println("      456,789 long -> " + nfLong.format(456_789));
        out.println("    2,000,000 long -> " + nfLong.format(2_000_000));
        out.println("3,456,789,000 long -> " + nfLong.format(3_456_789_000L));
    }
}
