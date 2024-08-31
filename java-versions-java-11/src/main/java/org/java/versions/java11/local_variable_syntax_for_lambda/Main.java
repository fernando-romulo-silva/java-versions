package org.java.versions.java11.local_variable_syntax_for_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static @interface MyAnnotation {

    }

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");

        // Support for using the local variable syntax (var keyword) in lambda
        // parameters was added in Java 11.

        // We can make use of this feature to apply modifiers to our local variables,
        // like defining a type annotation:

        String resultString = sampleList.stream()
                .map((@MyAnnotation var x) -> x.toUpperCase() + " bla") // here
                .collect(Collectors.joining(", "));

        String resultString2 = sampleList.stream()
                .map(x -> x.toUpperCase() + " bla") // this way, you can't put the annotation
                .collect(Collectors.joining(", "));

        // (var s1, s2) -> s1 + s2 //no skipping allowed
        // (var s1, String y) -> s1 + y //no mixing allowed
        // var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.

        System.out.println(resultString + resultString2);
    }
}
