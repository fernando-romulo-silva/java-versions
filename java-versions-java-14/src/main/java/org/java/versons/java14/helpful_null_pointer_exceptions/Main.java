package org.java.versons.java14.helpful_null_pointer_exceptions;

class Main {

    public int x = 10;

    public static void main(String[] args) {

	Main t = initT();

	int i = t.x;

    }

    private static Main initT() {
	return null;
    }

}
