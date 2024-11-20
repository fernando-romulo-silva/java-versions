package org.java.versions.java19.new_methods_create_pre_allocated_hashmap;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // If we want to create an ArrayList for a known number of elements (e.g., 120),
        // we can do it as follows since ever:

        List<String> list = new ArrayList<>(120);

        out.println("list: " + list);

        // Similarly, we have always been able to generate a HashMap as follows:
        Map<String, Integer> map = new HashMap<>(160);
        // for 120 mappings: 120 / 0.75 = 160

        // This is because the HashMap is initialized with a default load factor of
        // 0.75.
        //
        // This means that as soon as the HashMap is 75% full, it is rebuilt
        // ("rehashed") with double the size.

        out.println("map: " + map);
    }

}
