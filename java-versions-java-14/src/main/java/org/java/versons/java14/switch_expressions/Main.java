package org.java.versons.java14.switch_expressions;

public class Main {

    public static void main(String[] args) {
	
	final var day = "";
	
	boolean isTodayHolidayOld;
	
	// old
	switch (day) {
	    case "MONDAY":
	    case "TUESDAY":
	    case "WEDNESDAY":
	    case "THURSDAY":
	    case "FRIDAY":
	        isTodayHolidayOld = false;
	        break;
	    case "SATURDAY":
	    case "SUNDAY":
	        isTodayHolidayOld = true;
	        break;
	    default:
	        throw new IllegalArgumentException("What's a " + day);
	}
	
	// New
	boolean isTodayHolidayNew = switch (day) {
	    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
	    case "SATURDAY", "SUNDAY" -> true;
	    default -> throw new IllegalArgumentException("What's a " + day);
	};
	
    }
}
