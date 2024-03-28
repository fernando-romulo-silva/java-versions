package org.java.versions.java09.diamond_operator_extension;

import java.util.ArrayList;
import java.util.List;

class Main {

    
    public static void main(String[] args) {
	
	// Java 7 introduced the Diamond Operator (<>) to reduce verbosity by letting the compiler infer the parameter types for constructors:
	List<Integer> numbers1 = new ArrayList<>();

	// With Java 9, this small rough edge is removed, making the operator more universally applicable:
	List<Integer> numbers2 = new ArrayList<>() {
	    // ...
	    @Override
	    public boolean isEmpty() {
	        return false; 
	    }
	};
    }

}
