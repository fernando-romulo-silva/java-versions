package org.java.versions.java08.functional_interface;

import static java.lang.System.out;

class Main {

	// An Interface that contains exactly one abstract method is known as functional
	// interface.
	//
	// It can have any number of default, static methods but can contain only one
	// abstract method.
	//
	// It can also declare methods of object class.

	@FunctionalInterface
	static interface sayable {
		void say(String msg);

		default void think() {

		}
	}

	static class FunctionalInterfaceExample implements sayable {
		public void say(String msg) {
			out.println(msg);
		}
	}

	public static void main(String[] args) {
		sayable fie01 = new FunctionalInterfaceExample();
		fie01.say("Hello there");

		// OR

		sayable fie02 = msg -> out.println("Hey, " + msg);
		fie02.say(" what's up?");

		//

		fie02.think();
	}
}
