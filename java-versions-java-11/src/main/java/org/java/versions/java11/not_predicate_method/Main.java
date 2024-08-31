package org.java.versions.java11.not_predicate_method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");

        // A static not method has been added to the Predicate interface.
        // We can use it to negate an existing predicate, much like the negate method:

        final var withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());

        System.out.println(withoutBlanks);
    }
}
