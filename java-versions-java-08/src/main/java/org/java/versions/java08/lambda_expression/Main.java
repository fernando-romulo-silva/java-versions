package org.java.versions.java08.lambda_expression;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

class Main {

    // A lambda expression is a short block of code that takes in parameters and returns a value.
    // Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
    // Lambda expressions are usually passed as parameters to methods.

    static void example01() {
	List<String> groceryList = new ArrayList<>();
	groceryList.add("Sugar");
	groceryList.add("Salt");
	groceryList.add("Soap");

	groceryList.forEach(item -> out.println(item));
    }

    static interface Lambda {
	int display(int number);
    }

    static void example02() {
	/*
	 * store lambda in a variable of type interface that has only one method.
	 */
	Lambda lambda = number -> {
	    
	    out.print(number);
	    
	    return number * number;
	};
	/*
	 * The above code block will be called whenever display method is called using `lambda` variable
	 */
	out.println(lambda.display(20));
    }

    public static void main(String[] args) {

    }
}
