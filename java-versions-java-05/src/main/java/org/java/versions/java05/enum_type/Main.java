package org.java.versions.java05.enum_type;

class Main {

	// defining the enum inside the class
	static enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {
		// traversing the enum
		for (Season s : Season.values()) {
			System.out.println(s);
		}

		System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
	}

}
