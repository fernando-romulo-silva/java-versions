package org.java.versions.java06.console_class;

import static java.lang.System.out;

import java.io.Console;

class Main {

	// providing a simple way to read input from the console without resorting to
	// System.in and Scanner.
	public static void main(String[] args) {
		Console console = System.console();

		if (console != null) {
			String userInput = console.readLine("Enter your name: ");
			console.printf("Hello, %s!\n", userInput);
		} else {
			out.println("Console not available.");
		}
	}

}
