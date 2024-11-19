package org.java.versions.java16.other_changes;

import static java.lang.System.out;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayPeriodSupportAddedFormats {

    // With the DateTimeFormatter class, you can format date values of the Java
    // Date/Time API, e.g., LocalDate, LocalTime, LocalDateTime, or Instant, Year,
    // and YearMonth.

    public static void main(String[] args) {
        final var str01 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, h:mm a", Locale.US)
                .format(LocalDateTime.now());

        out.println(str01);

        // In Java 16, the list of available format characters has been extended by the
        // letter "B", which stands for a prolonged form of the time of day:
        final var str02 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, h:mm B", Locale.US)
                .format(LocalDateTime.now());

        out.println(str02);
    }
}
