package org.java.versions.java07.string_switch_selector;

class Main {

    public static void main(String[] args) {
	String day = "SAT";
	switch (day) { // switch on String selector (JDK 7)
	case "MON":
	case "TUE":
	case "WED":
	case "THU":
	    System.out.println("Working Day");
	    break;
	case "FRI":
	    System.out.println("Thank God It's Friday");
	    break;
	case "SAT":
	case "SUN":
	    System.out.println("Gone Fishing");
	    break;
	default:
	    System.out.println("Invalid");
	}
    }

}
