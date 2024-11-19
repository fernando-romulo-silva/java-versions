package org.java.versions.java16.new_stream_methods;

import static java.lang.System.out;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    // Java 16 introduces the following two new Stream methods:
    //
    public static void toListMethod() {
        // If you wanted to terminate a stream into a list, you had the following
        // options up to now:
        //
        // before
        // ArrayList:
        final var list01 = Stream.of("foo", "bar", "baz").collect(Collectors.toList());

        // ImmutableCollections$ListN:
        final var list02 = Stream.of("foo", "bar", "baz").collect(Collectors.toUnmodifiableList());

        // LinkedList:
        final var list03 = Stream.of("foo", "bar", "baz").collect(Collectors.toCollection(LinkedList::new));
        //
        // Stream.toList() is a fourth variant that also generates an unmodifiable list:
        final var list04 = Stream.of("foo", "bar", "baz").toList();

        out.println(list01);
        out.println(list02);
        out.println(list03);
        out.println(list04);
    }

    public static void mapMulti() {
        // o merge collections contained in a stream into a single collection, we
        // usually use flatMap():

        Stream<List<Integer>> stream = Stream.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));

        List<Integer> list01 = stream.flatMap(List::stream).toList();
        out.println(list01);

        // tream.mapMulti() was introduced as a more efficient, imperative alternative
        // to the declarative flatMap(): While with flatMap(), we specify which data we
        // want to merge, with mapMulti() we implement how to merge this data.

        List<Integer> list02 = stream
                .mapMulti(
                        (List<Integer> numbers, Consumer<Integer> consumer) -> numbers
                                .forEach(number -> consumer.accept(number)))
                .toList();

        out.println(list02);
    }
}
