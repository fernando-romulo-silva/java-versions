package org.java.versions.java15.hidden_classes;

import static java.lang.System.out;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

class Main {

    public static void main(String[] args) {
        // Provide the path to your .class file
        String classFilePath = "path/to/YourClass.class";
        try {

            // Read the .class file as bytes
            byte[] classBytes = Files.readAllBytes(Paths.get(classFilePath));

            // Encode the bytes to Base64
            String base64Encoded = Base64.getEncoder().encodeToString(classBytes);

            // Print or use the Base64-encoded string
            out.println("Base64 Encoded Class:\n" + base64Encoded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
