package org.java.versions.java08.string_joiner;

import static java.lang.System.out;

import java.util.StringJoiner;

class Main {

	// It is used to construct a sequence of characters separated by a delimiter.
	// Now, you can create string by passing delimiters like comma(,), hyphen(-)
	// etc.
	// You can also pass prefix and suffix to the char sequence.

	public static void test01() {

		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		out.println(joinNames);
	}

	public static void test02() {
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");

		// Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); // passing colon(:) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames2.add("Peter");
		joinNames2.add("Raheem");

		// Merging two StringJoiner
		StringJoiner merge = joinNames.merge(joinNames2);
		out.println(merge);

	}

}
