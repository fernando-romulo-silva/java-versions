package org.java.versions.java11.nest_based_access_control;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    static class MainClass {
        static class NestedClass {
            public String getNestHost() {
                return "";
            }
        }
    }

    public static void main(String[] args) {
        // A nest of classes in Java implies both the outer/main class and all its
        // nested classes:

        final var result = MainClass.class.isNestmateOf(MainClass.NestedClass.class);

        // Nested classes are linked to the NestMembers attribute, while the outer class
        // is linked to the NestHost attribute:
        MainClass.NestedClass.class.getNestHost();

        Set<String> nestedMembers = Arrays.stream(MainClass.NestedClass.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());

        System.out.println(nestedMembers);
    }
}
