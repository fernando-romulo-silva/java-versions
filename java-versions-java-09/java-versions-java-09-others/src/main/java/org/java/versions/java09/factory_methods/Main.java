package org.java.versions.java09.factory_methods;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Main {

    static void olderVersion() {

	List<String> list = new ArrayList<>();

	list.add("Java");
	list.add("JavaFX");
	list.add("Spring");
	list.add("Hibernate");
	list.add("JSP");

	for (String l : list) {
	    out.println(l);
	}
    }

    static void newVersion() {

	// List
	List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
	for (String l : list) {
	    out.println(l);
	}

	// Map
	Map<Integer, String> map1 = Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
	for (Map.Entry<Integer, String> m : map1.entrySet()) {
	    out.println(m.getKey() + " " + m.getValue());
	}

	// MapEntry
	// Creating Map Entry
	Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
	Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
	// Creating Map using map entries
	Map<Integer, String> map2 = Map.ofEntries(e1, e2);
	// Iterating Map
	for (Map.Entry<Integer, String> m : map2.entrySet()) {
	    out.println(m.getKey() + " " + m.getValue());
	}
    }

    public static void main(String[] args) {
	newVersion();
    }

}
