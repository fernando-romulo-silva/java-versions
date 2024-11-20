package org.java.versions.java19.additional_date_time_formats;

import static java.lang.System.out;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    // We can use the DateTimeFormatter.ofLocalizedDate(…), ofLocalizedTime(…), and
    // ofLocalizedDateTime(…) methods and the subsequent call to withLocale(…) to
    // generate a date/time formatter.
    //
    // We control the exact format using the FormatStyle enum, which can take the
    // values FULL, LONG, MEDIUM, and SHORT.
    public static void main(String[] args) {

        // In Java 19, the method ofLocalizedPattern(String requestedTemplate) was
        // added, with which we can also define flexible formats. Here is an example:

        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedPattern("yMMM");
        out.println("US:      " + formatter.withLocale(Locale.US).format(now));
        out.println("Germany: " + formatter.withLocale(Locale.GERMANY).format(now));
        out.println("Japan:   " + formatter.withLocale(Locale.JAPAN).format(now));
    }

}
