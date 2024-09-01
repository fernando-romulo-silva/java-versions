package org.java.versions.java05.auto_boxing_unboxing;

import static java.lang.System.out;

class Main {

	public static void main(String[] args) {

		// boxing
		int a1 = 50;
		Integer a2 = new Integer(a1);// Boxing

		Integer a3 = 5;// Boxing

		out.println(a2 + " " + a3);

		// unboxing
		Integer i = new Integer(50);
		int b1 = i;

		out.println(b1);

	}

}
