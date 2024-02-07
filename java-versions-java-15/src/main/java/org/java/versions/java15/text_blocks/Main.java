package org.java.versions.java15.text_blocks;

import static java.lang.System.out;

class Main {

    public static String getBlockOfHtml() {
	return """
			<html>

			    <body>
			        <span>example text</span>
			    </body>
			</html>""";
    }

    static String getTextWithCarriageReturns() {
	return """
			separated with\r
			carriage returns""";
    }

    static String getIgnoredNewLines() {
	return """
			This is a long test which looks to \
			have a newline but actually does not""";
    }

    static String getEscapedSpaces() {
	return """
			line 1·······
			line 2·······\s
			""";
    }

    static String getFormattedText(String parameter) {
	return """
			Some parameter: %s
			""".formatted(parameter);
    }

    public static void main(String[] args) {
	out.println(getFormattedText("1"));
    }
}
