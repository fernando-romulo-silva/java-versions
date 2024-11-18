package org.java.versions.java08.for_each;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<>();

		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");

		out.println("------------Iterating by passing lambda expression--------------");
		gamesList.forEach(games -> out.println(games));

		out.println("------------Iterating by passing method reference---------------");
		gamesList.forEach(out::println);

	}

}
