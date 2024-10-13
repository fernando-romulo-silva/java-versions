package org.java.versons.java14.returning_values_from_switch;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final var a = Boolean.TRUE;

		String toBeOrNotToBe = switch (a) {
			case Boolean.TRUE -> "To Be!";

			case Boolean.FALSE -> "Not to be";

		};
	}

}
