package org.java.versions.java17.instant_source;

import static java.lang.System.out;

import java.time.Duration;
import java.time.Instant;
import java.time.InstantSource;

public class Main {

    // The java.time.Clock class is handy for writing tests that check
    // time-dependent functionality.
    //
    // For example, when Clock is injected into the application classes via
    // dependency injection, it can be mocked into tests, or a fixed time for test
    // execution can be set using Clock.fixed().
    //
    // The Timer class in the following example uses InstantSource to determine the
    // start and end times of a Runnable execution and uses those times to calculate
    // the duration of execution:

    static class Timer {

        private final InstantSource instantSource;

        public Timer(final InstantSource instantSource) {
            this.instantSource = instantSource;
        }

        public Duration measure(final Runnable runnable) {

            Instant start = instantSource.instant();
            runnable.run();

            Instant end = instantSource.instant();

            return Duration.between(start, end);
        }
    }

    public static void main(String[] args) {
        InstantSource instantSource = new InstantSource() {

            @Override
            public Instant instant() {
                return Instant.now();
            }

        };

        Timer timer = new Timer(instantSource);

        Duration duration = timer.measure(() -> {
            out.println("");
        });
    }
}
