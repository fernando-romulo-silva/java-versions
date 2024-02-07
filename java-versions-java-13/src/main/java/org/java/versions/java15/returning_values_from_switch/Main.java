package org.java.versions.java15.returning_values_from_switch;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	final var a = Boolean.TRUE;
	
	boolean toBeOrNotToBe = switch (new Random().nextBoolean()) {
        	case Boolean.TRUE -> {
        		System.out.println("To Be!");
        		break true;
        	}
        	case Boolean.FALSE -> {
        		System.out.println("Not to be");
        		break false;
        	}
	}
    }

}
