package org.java.versions.java11.collection_to_array;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // The java.util.Collection interface contains a new default toArray method
        // which takes an IntFunction argument.
        // This makes it easier to create an array of the right type from a collection:

        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);

        System.out.println(sampleArray);
    }
}
