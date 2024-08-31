package org.java.versions.java11.timeUnit_conversion;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        TimeUnit c = TimeUnit.DAYS;

        c.convert(Duration.ofHours(24)); // 1 day

        c.convert(Duration.ofHours(50)); // 2 day 48 hours, but rounded

    }
}
