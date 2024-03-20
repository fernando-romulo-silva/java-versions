package org.java.versions.java05.varargs;

public class Main {

    static void display(String... values) {
	System.out.println("display method invoked ");
    }

    static void displayNew(Long number, String... values) {
	System.out.println("display new method invoked ");
    }

    public static void main(String[] args) {
	display();// zero argument
	display("hello");// one argument
	display("my", "name", "is", "varargs");// four arguments
    }

}
