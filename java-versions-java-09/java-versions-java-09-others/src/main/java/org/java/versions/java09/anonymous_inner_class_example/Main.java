package org.java.versions.java09.anonymous_inner_class_example;

class Main {

    static abstract class ABCD<T> {
	abstract T show(T a, T b);
    }

    // Using the diamond with anonymous classes was not allowed in Java 7.
    public static void main(String[] args) {
	
	ABCD<String> a = new ABCD<String>() { // diamond operator is not empty
	    String show(String a, String b) {
		return a + b;
	    }
	};
	
	a.show("a", "b");
    }

}
