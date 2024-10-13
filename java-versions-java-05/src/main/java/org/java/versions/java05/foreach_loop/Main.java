package org.java.versions.java05.foreach_loop;

import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

		// declaring an array
		int arr[] = { 12, 13, 14, 44 };

		// traversing the array with for-each loop
		for (int i : arr) {
			System.out.println(i);
		}

		// ================================================

		ArrayList<String> list = new ArrayList<String>();
		list.add("vimal");
		list.add("sonoo");
		list.add("ratan");

		// traversing the list of elements using for-each loop
		for (String s : list) {
			System.out.println(s);
		}
	}
}
