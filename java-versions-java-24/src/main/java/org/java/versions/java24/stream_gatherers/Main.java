package org.java.versions.java24.stream_gatherers;

import static java.lang.System.out;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Gatherer;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class Main {

    // As you know, Stream API operations are divided into intermediate operations
    // that generate a new Stream and terminal operations that create a result or
    // have a side effect.
    //
    // However, terminal operations have collect(Collector), which allows us to
    // create custom operations via the Collector implementation.
    //
    // The set of intermediate ones has only map, flatMap, filter, distinct, sorted,
    // peek, and sorted.

    // That's the case—until Java 24, which introduces Stream Gatherers.

    private static void test01() {
        final var names = List.of("Peter", "Joana", "Paul", "Jean");

        final var filtered = names.stream() // Create a stream from names collection
                .filter(name -> name.startsWith("J")) // Intermediate operation
                .collect(Collectors.toList()); // Terminal operation

        out.println(filtered);

        out.println();

        // Using gather
        // Example of fixed window gathering
        final var filteredGatther = names.stream() // Create a stream from names collection
                .gather(Gatherers.windowFixed(3))
                .collect(Collectors.toList()); // Terminal operation

        out.println(filteredGatther);
    }

    public static void test03() {
        Stream.of("A", "B", "CC", "DD", "EEE")
                .gather(distinctBy(String::length))
                .toList();
    }

    public static void main(String[] args) {
        test01();
    }

    // Gatherer<T, A, R> gathererExample = Gatherer.of(
    // === () -> ...., //initializer
    // === (x,y) -> ....., //integrator
    // === (s1,s2) -> ....., //combiner
    // ===(i,n) -> ..... , // finisher
    // );

    static <A, D> Gatherer<A, Map<D, A>, A> distinctBy(Function<A, D> disctinction) {
        return Gatherer.of(
                LinkedHashMap::new,
                Gatherer.Integrator.ofGreedy((state, element, downstream) -> {
                    state.putIfAbsent(disctinction.apply(element), element);
                    return !downstream.isRejecting();
                }),
                (stateLeft, stateRight) -> {
                    stateRight.forEach(stateLeft::putIfAbsent);
                    return stateLeft;
                },
                (state, downstream) -> state.values().forEach(downstream::push));
    }
}
