package org.java.versions.java25.scoped_values;

import java.util.concurrent.Executors;

class Example01 {

    static final ScopedValue<String> USER = ScopedValue.newInstance();

    static void main() {
        try (final var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> ScopedValue.where(USER, "Alice").run(() -> {
                IO.println("Thread: " + Thread.currentThread());
                IO.println("User: " + USER.get());
            }));

            executor.submit(() -> ScopedValue.where(USER, "Bob").run(() -> {
                IO.println("Thread: " + Thread.currentThread());
                IO.println("User: " + USER.get());
            }));

            Thread.sleep(200);

        } catch (InterruptedException _) {
            Thread.currentThread().interrupt();
        }
    }
}
