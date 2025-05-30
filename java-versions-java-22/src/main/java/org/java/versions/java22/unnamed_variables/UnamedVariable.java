package org.java.versions.java22.unnamed_variables;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Transaction implements AutoCloseable {

    @Override
    public void close() {
        out.println("Closed!");
    }
}

public class UnamedVariable {
    static int countCarsOverLimitWithNamedVariable(Collection<Car<?>> cars, int limit) {
        var total = 0;
        var totalOverLimit = 0;
        for (var car : cars) {
            total++;
            if (total > limit) {
                totalOverLimit++;
                // side effect
            }
        }
        return totalOverLimit;
    }

    static int countCarsOverLimitWithUnnamedVariable(Collection<Car<?>> cars, int limit) {
        var total = 0;
        var totalOverLimit = 0;
        for (var _ : cars) {
            total++;
            if (total > limit) {
                totalOverLimit++;
                // side effect
            }
        }
        return totalOverLimit;
    }

    static void sendNotificationToCarsWithNamedVariable(Collection<Car<?>> cars) {
        sendOneTimeNotification();
        for (int i = 0; i < cars.size(); i++) {
            // Notify car
        }
    }

    static void sendNotificationToCarsWithUnnamedVariable(Collection<Car<?>> cars) {
        for (int i = 0, _ = sendOneTimeNotification(); i < cars.size(); i++) {
            // Notify car
        }
    }

    private static int sendOneTimeNotification() {
        out.println("Sending one time notification!");
        return 1;
    }

    static Car<?> removeThreeCarsAndReturnFirstRemovedWithNamedVariables(Queue<Car<?>> cars) {
        var x = cars.poll();
        var y = cars.poll();
        var z = cars.poll();
        return x;
    }

    static Car<?> removeThreeCarsAndReturnFirstRemovedWithUnnamedVariables(Queue<Car<?>> cars) {
        var car = cars.poll();
        var _ = cars.poll();
        var _ = cars.poll();
        return car;
    }

    static void handleCarExceptionWithNamedVariables(Car<?> car) {
        try {
            someOperationThatFails(car);
        } catch (IllegalStateException ex) {
            out.println("Got an illegal state exception for: " + car.name());
        } catch (RuntimeException ex) {
            out.println("Got a runtime exception!");
        }
    }

    static void handleCarExceptionWithUnnamedVariables(Car<?> car) {
        try {
            someOperationThatFails(car);
        } catch (IllegalStateException | NumberFormatException _) {
            out.println("Got an illegal state exception for: " + car.name());
        } catch (RuntimeException _) {
            out.println("Got a runtime exception!");
        }
    }

    static void obtainTransactionAndUpdateCarWithNamedVariables(Car<?> car) {
        try (var transaction = new Transaction()) {
            updateCar(car);
        }
    }

    static void obtainTransactionAndUpdateCarWithUnnamedVariables(Car<?> car) {
        try (var _ = new Transaction()) {
            updateCar(car);
        }
    }

    static void updateCar(Car<?> car) {
        // Some update logic
        out.println("Car updated!");
    }

    static Map<String, List<Car<?>>> getCarsByFirstLetterWithNamedVariables(List<Car<?>> cars) {
        Map<String, List<Car<?>>> carMap = new HashMap<>();
        cars.forEach(
                car -> carMap.computeIfAbsent(
                        car.name().substring(0, 1),
                        firstLetter -> new ArrayList<>())
                        .add(car));
        return carMap;
    }

    static Map<String, List<Car<?>>> getCarsByFirstLetterWithUnnamedVariables(List<Car<?>> cars) {
        Map<String, List<Car<?>>> carMap = new HashMap<>();
        cars.forEach(car -> carMap.computeIfAbsent(
                car.name().substring(0, 1),
                _ -> new ArrayList<>())
                .add(car));
        return carMap;
    }

    private static void someOperationThatFails(Car<?> car) {
        throw new IllegalStateException("Triggered exception for: " + car.name());
    }
}
