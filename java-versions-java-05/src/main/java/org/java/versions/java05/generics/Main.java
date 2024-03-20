package org.java.versions.java05.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    static class MyClass<T> {
	
	T get(final T t) {
	    return t;
	}
    }

    public static void main(String[] args) {
	
	List list1 = new ArrayList();    
	list1.add(10);  
	list1.add("10");
	
	// With Generics, it is required to specify the type of object we need to store.  
	List<Integer> list = new ArrayList<Integer>();    
	list.add(10);  
	//list.add("10");// compile-time error  
    }
}
