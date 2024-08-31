package org.versions.java10.optional_orElseThrow;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Integer> someIntList = new ArrayList<>();

        Integer firstEven = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();
    }
}
