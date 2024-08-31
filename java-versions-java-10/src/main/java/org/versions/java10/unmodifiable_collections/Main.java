package org.versions.java10.unmodifiable_collections;

import java.util.List;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // java.util.List, java.util.Map and java.util.Set each got a new static method
        // copyOf(Collection).
        // It returns the unmodifiable copy of the given Collection:

        final List<Integer> someIntList = new ArrayList<>();

        List<Integer> copyList = List.copyOf(someIntList);

        // New methods toUnmodifiableList, toUnmodifiableSet, and toUnmodifiableMap have
        // been added to the Collectors class in the Stream package.

        // These allow the elements of a Stream to be collected into an unmodifiable
        // collection.

    }
}
