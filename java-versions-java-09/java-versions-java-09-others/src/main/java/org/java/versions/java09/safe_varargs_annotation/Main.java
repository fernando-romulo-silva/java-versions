package org.java.versions.java09.safe_varargs_annotation;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

class Main {

    // It is an annotation which applies on a method or constructor that takes varargs parameters. 
    // It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
    //
    static void displayUnsafe(List<String>... products) { // Not using @SaveVarargs
	for (List<String> product : products) {
	    out.println(product);
	}
    }

    static void testDisplayUnsafe() {
	List<String> list1 = new ArrayList<>();
	list1.add("Laptop");
	list1.add("Tablet");
	
	// This is a compiler generated warning regarding unsafe varargs type.
	displayUnsafe(list1);
    }

    // ===============================================================================
    @SafeVarargs  
    static void displaySafe(List<String>... products) { // Not using @SaveVarargs
	for (List<String> product : products) {
	    out.println(product);
	}
    }
    
    static void testDisplaySafe() {
	List<String> list = new ArrayList<>();
	list.add("Laptop");
	list.add("Tablet");
	
	displaySafe(list);
    }

    
    public static void main(String[] args) {
	testDisplayUnsafe(); // error
    }
}
