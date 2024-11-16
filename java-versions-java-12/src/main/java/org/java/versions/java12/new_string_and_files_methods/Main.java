package org.java.versions.java12.new_string_and_files_methods;

import static java.lang.System.out;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void testIndent() {

        // Java 12 has such a method built-in: String.indent(). The following example
        // shows how to indent a multiline string by four spaces:

        String s = "I am\na multiline\nString.";
        out.println(s);
        out.println(s.indent(4));
    }

    public static void testTransfor() {
        // The new String.transform() method applies an arbitrary function to a String
        // and returns the function's return value. Here are a few examples:

        String uppercase = "abcde".transform(String::toUpperCase);
        Integer i = "12345".transform(Integer::valueOf);
        BigDecimal big = "1234567891011121314151617181920".transform(BigDecimal::new);

        out.println(big);
    }

    public static void testMismatch() throws IOException {
        // You can use the Files.mismatch() method to compare the contents of two files.

        // create two files in temp directory
        Path path1 = Files.createTempFile("file1", ".txt");
        Path path2 = Files.createTempFile("file2", ".txt");

        // write same content to both the files
        Files.writeString(path1, "tutorialspoint");
        Files.writeString(path2, "tutorialspoint Java 12");

        // check files for Mismatch,
        // being different content, it should return index of first mismatch.
        long mismatch = Files.mismatch(path1, path2);

        // print the message based on mismatch result
        if (mismatch > 1L) {
            out.println("Mismatch occurred in file1 and file2 at : " + mismatch);
        } else {
            out.println("Files matched");
        }

        // delete the files
        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();
    }

    public static void main(String[] args) throws Exception {
        testMismatch();
    }
}
