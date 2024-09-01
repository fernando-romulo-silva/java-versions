package org.java.versions.java09.try_with_resources;

import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Main {

	// Java introduced try-with-resource feature in Java 7 that helps to close
	// resource automatically after being used.
	//
	// In other words, we can say that we don't need to close resources (file,
	// connection, network etc) explicitly, try-with-resource close that
	// automatically by using AutoClosable interface.
	//
	// In Java 7, try-with-resources has a limitation that requires resource to
	// declare locally within its block.

	static void olderVersion() {

		// Java 7
		try (final FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");) {
			String greeting = "Welcome to javaTpoint.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			out.println("File written");
		} catch (Exception e) {
			out.println(e);
		}
	}

	static void newVersion() throws FileNotFoundException {

		// Java 9
		FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");

		try (fileStream) {
			String greeting = "Welcome to javaTpoint.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			out.println("File written");
		} catch (Exception e) {
			out.println(e);
		}
	}

	public static void main(String[] args) {

	}

}
