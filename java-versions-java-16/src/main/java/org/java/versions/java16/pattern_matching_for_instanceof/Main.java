package org.java.versions.java16.pattern_matching_for_instanceof;

import static java.lang.System.out;

public class Main {

    public static Object getObject() {

        return "bla bla";

    }

    public static void main(String[] args) {

        Object obj = getObject();

        // the old way
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 5) {
                out.println(s.toUpperCase());
            }
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            out.println(i * i);
        }

        // The following code shows how we can do it better since Java 16:
        if (obj instanceof String s) { // <-- implicit cast to String s
            if (s.length() > 5) {
                out.println(s.toUpperCase());
            }
        } else if (obj instanceof Integer i) { // <-- implicit cast to Integer i
            out.println(i * i);
        }

        // We can go one step further and combine the first two if statements:
        if (obj instanceof String s && s.length() > 5) {
            out.println(s.toUpperCase());
        } else if (obj instanceof Integer i) {
            out.println(i * i);
        }
    }
}
