package org.java.versions.java19.utf8_by_default;

import static java.lang.System.out;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    // The Java standard character set determines how Strings are converted to bytes
    // and vice versa in numerous methods of the JDK class library (e.g., when
    // writing and reading a text file). These include, for example:
    //
    // * the constructors of FileReader, FileWriter, InputStreamReader,
    // OutputStreamWriter,
    //
    // * the constructors of Formatter and Scanner,
    //
    // * the static methods URLEncoder.encode() and URLDecoder.decode().
    //
    // This can lead to unpredictable behavior when an application is developed and
    // tested in one environment – and then run in another (where Java chooses a
    // different default character set).

    // For example,let's run the following code on Linux
    //
    // or macOS (the Japanese text is "Happy Coding!" according to Google
    // Translate):

    public static void main(String[] args) throws IOException {

        try (FileWriter fw = new FileWriter("happy-coding.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("ハッピーコーディング！");
        }

        String text = Files.readString(Path.of("happy-coding.txt"), StandardCharsets.UTF_8);
        out.println(text);

        // With JDK Enhancement Proposal 400, the problems mentioned above will – at
        // least for the most part – be a thing of the past as of Java 18.

        out.println("Default charset : " + Charset.defaultCharset());
        out.println("file.encoding   : " + System.getProperty("file.encoding"));
        out.println("native.encoding : " + System.getProperty("native.encoding"));
    }

}
