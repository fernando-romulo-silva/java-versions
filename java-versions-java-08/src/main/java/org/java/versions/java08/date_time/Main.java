package org.java.versions.java08.date_time;

import static java.lang.System.out;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

class Main {

    static void localDate() {

	LocalDate date = LocalDate.now();
	LocalDate yesterday = date.minusDays(1);
	LocalDate tomorrow = yesterday.plusDays(2);

	out.println("Today date: " + date);
	out.println("Yesterday date: " + yesterday);
	out.println("Tomorrow date: " + tomorrow);

	DayOfWeek dayOfWeek = DayOfWeek.from(date);
	out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
    }

    static void localTime() {
	LocalTime time = LocalTime.now();
	out.println(time);
    }

    static void duration() {

	Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);

	out.println(d.get(ChronoUnit.SECONDS));
    }

}
