package org.java.versions.java09.diamond_operator_extension;

import java.util.ArrayList;
import java.util.List;

class Main {

	abstract static class ABCD<T> {
		abstract T show(T a, T b);
	}

	public static void main(String[] args) {

		// Java 7 introduced the Diamond Operator (<>) to reduce verbosity by letting
		// the compiler infer the parameter types for constructors:
		List<Integer> numbers1 = new ArrayList<>();

		// With Java 9, this small rough edge is removed, making the operator more
		// universally applicable:
		List<Integer> numbers2 = new ArrayList<>() {
			// ...
			@Override
			public boolean isEmpty() {
				return false;
			}
		};

		// Using the diamond with anonymous classes was not allowed in Java 7.
		ABCD<String> a = new ABCD<>() { // diamond operator is not empty
			String show(String a, String b) {
				return a + b;
			}
		};

		a.show("a", "b");
	}

}
