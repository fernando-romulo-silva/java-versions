package org.java.versions.java12.teeing_collector;

import static java.lang.System.out;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    // For some requirements, you may want to terminate a Stream with two collectors
    // instead of one and combine the result of both collectors.
    //
    // In the following example source code, we want to determine the difference
    // from largest to smallest number from a stream of random numbers

    // (we use Optional.orElseThrow() introduced in Java 10 to avoid a "code smell"
    // blaming):

    static void test01() {
        Stream<Integer> numbers = new Random().ints(100).boxed();

        int min = numbers.collect(Collectors.minBy(Integer::compareTo)).orElseThrow();
        int max = numbers.collect(Collectors.maxBy(Integer::compareTo)).orElseThrow(); // Exception!

        long range = (long) max - min;

        out.println(range);
    }

    // We can do it easier using the "Teeing Collector" introduced in Java 12. We
    // can specify two collectors (called downstream collectors) and a merger
    // function that combines the results of the two collectors:

    static void test02() {
        Stream<Integer> numbers = new Random().ints(100).boxed();

        long range = numbers.collect(
                Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.maxBy(Integer::compareTo),
                        (min, max) -> (long) max.orElseThrow() - min.orElseThrow()));

        out.println(range);
    }

    public static void main(String[] args) {
        test02();
    }
}
