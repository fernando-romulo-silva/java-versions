package org.java.versions.java05.enum_type;

import static java.lang.System.out;

class Main {

	// defining the enum inside the class
	enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {
		// traversing the enum
		for (Season s : Season.values()) {
			out.println(s);
		}

		out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
	}

}
