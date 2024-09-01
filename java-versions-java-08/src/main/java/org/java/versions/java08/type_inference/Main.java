package org.java.versions.java08.type_inference;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

class Main {

	// Type inference is a feature of Java which provides ability to compiler to
	// look at each method invocation and corresponding declaration to determine the
	// type of arguments.

	public static void showList(List<Integer> list) {

		if (!list.isEmpty()) {
			list.forEach(out::println);
		} else {
			out.println("list is empty");
		}
	}

	public static void main(String[] args) {

		// An old approach(prior to Java 7) to create a list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		showList(list1);

		// Java 7
		List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
		list2.add(12);
		showList(list2);

		// Compiler infers type of ArrayList, in Java 8
		showList(new ArrayList<>());
	}

}
