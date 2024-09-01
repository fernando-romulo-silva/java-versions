package org.java.versions.java08.repeatable_annotation_type;

import static java.lang.System.out;

import java.lang.annotation.Repeatable;

class Main {

    public @interface Schedules {
        Schedule[] value();
    }

    @Repeatable(Schedules.class)
    public @interface Schedule {
        String dayOfMonth() default "first";

        String dayOfWeek() default "Mon";

        int hour() default 12;
    }

    @Schedule(dayOfMonth = "last")
    @Schedule(dayOfWeek = "Fri")
    public void doPeriodicCleanup() {

        out.println("....");
    }
}
