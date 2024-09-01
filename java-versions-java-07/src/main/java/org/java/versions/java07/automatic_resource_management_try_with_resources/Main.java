package org.java.versions.java07.automatic_resource_management_try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {

	public static void main(String[] args) {
		try (
				BufferedReader src = new BufferedReader(new FileReader("in.txt"));
				BufferedWriter dest = new BufferedWriter(new FileWriter("out.txt"))) {

			String line;

			while ((line = src.readLine()) != null) {
				System.out.println(line);
				dest.write(line);
				dest.newLine();
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// src and dest automatically close.
		// No need for finally to explicitly close the resources.
	}

}
