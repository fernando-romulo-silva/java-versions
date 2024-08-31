package org.java.versions.pattern_matching_for_switch;

import static java.lang.System.out;

import java.time.DayOfWeek;

public class Main {

	static record Point(int x, int y) {
	};

	// Previously, switch was very limited: the cases could only test exact
	// equality, and only for values of a few types: numbers, Enum types and
	// Strings.
	// This feature enhances switch to work on any type and to match on more complex
	// patterns.

	public static void print(final Object o) {

		switch (o) {
			case Point(int x, int y) -> out.printf("o is a position: %d/%d%n", x, y);
			case String s -> out.printf("o is a string: %s%n", s);
			case null -> out.printf("o is null");
			default -> out.printf("o is something else: %s%n", o);
		}
	}

	static String describe(DayOfWeek dow) {
		return switch (dow) {
			case TUESDAY -> "Taco Tuesday";
			case WEDNESDAY -> "Margarita Wednesday";
			case SATURDAY, SUNDAY -> "Party time!";
			default -> "Boring work day...";
		};
	}

}
