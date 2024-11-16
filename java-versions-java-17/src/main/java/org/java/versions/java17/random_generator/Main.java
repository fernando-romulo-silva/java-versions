package org.java.versions.java17.random_generator;

import static java.lang.System.out;

import java.util.Comparator;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Main {

    // The main goals of the new RandomGenerator API are:
    //
    // * Ensure easier interchangeably of different algorithms
    // * Enable better support for stream-based programming
    // * Eliminate code duplication in existing classes
    // * Preserve existing behavior of the old Random API

    public static void main(String[] args) {
        final var r01 = RandomGeneratorFactory.getDefault();

        final var r02 = RandomGeneratorFactory.all();

        r02.sorted(Comparator.comparing(RandomGeneratorFactory::name))
                .forEach(factory -> out.println(String.format("%s\t%s\t%s\t%s",
                        factory.group(),
                        factory.name(),
                        factory.isJumpable(),
                        factory.isSplittable())));

        //

        RandomGenerator generator = RandomGenerator.of("L128X256MixRandom");
    }

    private static void generateRandomNumbers(RandomGenerator generator) {
        generator.nextLong();
        generator.nextInt();
        generator.nextFloat();
        generator.nextDouble();
    }
}
