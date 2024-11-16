package org.java.versions.java17.restore_always_strict_floating_floating_semantics;

public class Main {

    // Starting with Java 1.2, "standard floating-point semantics" was used by
    // default, leading to slightly different results depending on the processor
    // architecture.

    // On the other hand, it was more performant, especially on the
    // x87 floating-point coprocessor, which was widespread at that time, since it
    // had to perform additional operations for the strict semantics (for more
    // details, see this Wikipedia article).

    // Modern hardware can perform strict floating-point semantics without
    // performance degradation.

    // So it was decided in JDK Enhancement Proposal 306 to make it the default
    // semantics again, starting with Java 17.

    public static strictfp class PredictiveCalculator {
        // ...
    }
}
