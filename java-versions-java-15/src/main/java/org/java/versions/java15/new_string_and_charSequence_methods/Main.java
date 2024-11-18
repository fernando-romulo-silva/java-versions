package org.java.versions.java15.new_string_and_charSequence_methods;

import static java.lang.System.out;

import java.time.ZonedDateTime;
import java.util.Formatter;

public class Main {

    // A few methods have been added to the String and CharSequence classes in Java
    // 15.
    // These extensions are not defined in JDK Enhancement Proposals.

    public static void main(String[] args) {

        final var userId = "12354";
        final var username = "Fer";

        // String.formatted()

        // We could previously replace placeholders in a string as follows, for example:
        final var message01 = String.format(
                "User %,d with username %s logged in at %s.",
                userId, username, ZonedDateTime.now());

        out.println(message01);

        // Starting from Java 15, we can use an alternative syntax:
        final var message02 = "User %,d with username %s logged in at %s."
                .formatted(userId, username, ZonedDateTime.now());

        out.println(message02);
        // It makes no difference which method you use.
        // Both methods will eventually call the following code:

        try (final var formatter = new Formatter()) {
            final var message03 = formatter.format(
                    "User %,d with username %s logged in at %s.",
                    userId, username, ZonedDateTime.now())
                    .toString();

            out.println(message03);
        }

        // String.stripIndent()

        // Suppose we have a multi-line string where each line is intended and has some
        // trailing spaces, such as the following.
        //
        // We print each line, bounded by two vertical bars.

        final var html01 = """
                  <html>    s
                    <body>      s
                      <h1>Hello!</h1>
                    </body>    s
                  </html>         s
                """;

        html01.lines()
                .map(line -> "|" + line + "|")
                .forEachOrdered(out::println);

        // As you learned in the first chapter, the alignment of a text block is based
        // on the closing quotation marks. The output, therefore, looks like this:
        /**
         * <code>
         * 
         * |  <html>     |
         * |    <body>       |
         * |      <h1>Hello!</h1>|
         * |    </body>     |
         * |  </html>          |
         * </code>
         */

        // Using the stripIndent() method, we can remove the indentation and trailing
        // spaces:
        html01.stripIndent()
                .lines()
                .map(line -> "|" + line + "|")
                .forEachOrdered(out::println);
        /**
         * <code>
         * |<html>|
         * |  <body>|
         * |    <h1>Hello!</h1>|
         * |  </body>|
         * |</html>|
         * </code>
         */

        // String.translateEscapes()

        // Occasionally we get to deal with a string that contains escaped escape
        // sequences, such as the following:

        String s = "foo\\nbar\\tbuzz\\\\";
        out.println(s);
        // foo\nbar\tbuzz\\
        //
        // Sometimes, however, we want to display the evaluated escape sequences: a
        // newline instead of "\n", a tab instead of "\t", and a backslash instead of
        // "\".
        //
        // Starting from Java 15, we can avoid the additional dependency and use the JDK
        // method String.translateEscapes():

        out.println(s.translateEscapes());
        // foo
        // bar buzz
        //

        // CharSequence.isEmpty()
        // Also new is the default method isEmpty() in the CharSequence interface. The
        // method simply checks whether the character sequence's length is 0:

        if (s.isEmpty()) {
            out.println("Empty string");
        }

    }

}
