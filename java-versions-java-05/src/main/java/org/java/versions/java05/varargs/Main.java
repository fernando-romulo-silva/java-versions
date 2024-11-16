package org.java.versions.java05.varargs;

import static java.lang.System.out;

public class Main {

    static void display(String... values) {
        out.println("display method invoked ");
    }

    static void displayNew(Long number, String... values) {
        out.println("display new method invoked ");
    }

    public static void main(String[] args) {
        display();// zero argument
        display("hello");// one argument
        display("my", "name", "is", "varargs");// four arguments
    }

}
