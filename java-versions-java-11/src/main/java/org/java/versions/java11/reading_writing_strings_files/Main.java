package org.java.versions.java11.reading_writing_strings_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        // Java 11 strives to make reading and writing of String convenient.
        // It has introduced the following methods for reading and writing to/from the
        // files: readString() and writeString()
        //
        //

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        //
        String s = Files.readString(path);
        System.out.println(s); // This was posted on JD
    }
}
