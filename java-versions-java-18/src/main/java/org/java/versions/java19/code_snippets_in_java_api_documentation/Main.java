package org.java.versions.java19.code_snippets_in_java_api_documentation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    // Until now, if we wanted to integrate multiline code snippets into JavaDoc, we
    // had to do this quite cumbersomely via <pre>…</pre> – optionally in
    // combination with {@code … }.
    //
    // For this, we had to pay attention to two things:
    //
    // * There must be no line breaks between <pre> and the code and between the
    // code and </pre>.
    //
    // * The code starts directly after the asterisks; i.e., if there are spaces
    // between the asterisks and the code, they also appear in the JavaDoc.
    // So the code must be shifted one character to the left compared to the rest of
    // the text in the JavaDoc comment.
    //
    // Here is an example with <pre>:
    /**
     * How to write a text file with Java 7:
     *
     * <pre>
     * <b>try</b> (BufferedWriter writer = Files.<i>newBufferedWriter</i>(path)) {
     *  writer.write(text);
     *}
     * </pre>
     */
    //
    // And one with <pre> and {@code … }:
    /**
     * How to write a text file with Java 7:
     *
     * <pre>{@code
     * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *     writer.write(text);
     * }
     * }</pre>
     */
    //
    //
    // The @snippet Tag in Java 18
    //
    // JDK Enhancement Proposal 413 enhances the JavaDoc syntax with the @snippet
    // tag, specifically designed to display source code.
    //
    // With the @snippet tag, we can write the comment as follows:
    /**
     * How to write a text file with Java 7:
     *
     * {@snippet :
     * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *     writer.write(text);
     * }
     * }
     */
    //
    // We can also highlight parts of the code using @highlight – for example, all
    // occurrences of "text" within the second line of code:
    //
    //
    /**
     * {@snippet :
     * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *     writer.write(text);  // @highlight substring = "text"
     * }
     * }
     */
    //
    //
    // Integrate Snippets from Other Files
    //
    // According to JEP, it should also be possible to refer to marked code in
    // another file:
    /**
     * How to write a text file with Java 7:
     *
     * {@snippet file = "FileWriter.java" region = "writeFile"}
     * 
     * @throws IOException
     */
    public static void myMethod() throws IOException {
        // @start region = "writeFile"
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("path"))) {
            writer.write("Some text");
        }
        // @end
    }

}
