package org.java.versons.java14.switch_expressions;

import static java.lang.System.out;

public class Main {

	// Switch Expressions is the second language enhancement from Project Amber to
	// reach production status (the first was "var" in Java 10).
	//
	// Switch expressions allow a much more concise notation than before using arrow
	// notation:

	public static void main(String[] args) {

		final var day = "MONDAY";

		boolean isTodayHolidayOld;

		// old
		switch (day) {
			case "MONDAY":
			case "TUESDAY":
			case "WEDNESDAY":
			case "THURSDAY":
			case "FRIDAY":
				isTodayHolidayOld = false;
				break;
			case "SATURDAY":
			case "SUNDAY":
				isTodayHolidayOld = true;
				break;
			default:
				throw new IllegalArgumentException("What's a " + day);
		}

		out.println(day);

		// New
		boolean isTodayHolidayNew = switch (day) {
			case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
			case "SATURDAY", "SUNDAY" -> true;
			default -> throw new IllegalArgumentException("What's a " + day);
		};

		out.println(isTodayHolidayNew);

	}
}
