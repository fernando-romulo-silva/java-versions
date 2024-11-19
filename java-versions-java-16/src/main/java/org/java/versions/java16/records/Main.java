package org.java.versions.java16.records;

public class Main {

	// Records provide a compact notation to define classes with only final fields
	// as in the following example:

	static class Person {

		private final String name;

		private final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {

		final Object person = new Person("Mary", 1);

		// old version
		if (person instanceof Person) {
			final var employee = (Person) person;
			employee.getAge();
			// ...
		}

		// new version
		if (person instanceof Person person2 && person2.getAge() > 2) {
			person2.getAge();
			// ...
		}
	}

}
