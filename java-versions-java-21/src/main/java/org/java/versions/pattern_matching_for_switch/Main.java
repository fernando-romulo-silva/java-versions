package org.java.versions.pattern_matching_for_switch;

public class Main {

    static record Point(int x, int y) {};
    
    public static void print(final Object o) {

	  switch (o) {
	    case Point(int x, int y) -> System.out.printf("o is a position: %d/%d%n", x, y);
	    case String s            -> System.out.printf("o is a string: %s%n", s);
	    default                  -> System.out.printf("o is something else: %s%n", o);
	  }
     }


}
