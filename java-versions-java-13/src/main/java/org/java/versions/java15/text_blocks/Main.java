package org.java.versions.java15.text_blocks;

import static java.lang.System.out;

class Main {

    final static String JSON_STRING = "{\r\n" + "\"name\" : \"Baeldung\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n" + "}";

    public static void main(String[] args) {

	JSON_STRING.stripIndent();

	System.out.println(JSON_STRING.replace(" ", "*"));
	System.out.println(JSON_STRING.stripIndent().replace(" ", "*"));
	
	
	String str1 = "Hi\t\nHello' \" /u0022 Pankaj\r";
	System.out.println(str1);
	System.out.println(str1.translateEscapes());
    }
}
