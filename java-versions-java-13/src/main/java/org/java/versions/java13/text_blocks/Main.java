package org.java.versions.java13.text_blocks;

import static java.lang.System.out;

class Main {

	final static String JSON_STRING = "{\r\n" //
			+ "\"name\" : \"Baeldung\",\r\n" //
			+ "\"website\" : \"https://www.%s.com/\"\r\n" //
			+ "}";

	public static void main(String[] args) {

		JSON_STRING.stripIndent();

		out.println(JSON_STRING.replace(" ", "*"));
		out.println(JSON_STRING.stripIndent().replace(" ", "*"));

		String str1 = "Hi\t\nHello' \" /u0022 Pankaj\r";
		out.println(str1);
		out.println(str1.translateEscapes());
	}
}
