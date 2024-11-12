package org.java.versions.java22.locale_dependent_list_patterns;

import static java.lang.System.out;

import java.text.ListFormat;
import java.util.List;
import java.util.Locale;
import java.text.ListFormat.Type;
import java.text.ListFormat.Style;

public class Main {

    // With the new ListFormat class, lists can be formatted as enumerations, just
    // as we would formulate them in continuous text.

    public static void main(String[] args) {

        List<String> list = List.of("Earth", "Wind", "Fire");

        ListFormat formatter = ListFormat.getInstance(Locale.US, Type.STANDARD, Style.FULL);

        out.println(formatter.format(list));
    }
}
