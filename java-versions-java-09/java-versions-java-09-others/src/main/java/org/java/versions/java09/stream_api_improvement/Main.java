package org.java.versions.java09.stream_api_improvement;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

class Main {
    
    static final List<Integer> FULL_LIST_01 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    static final List<Integer> FULL_LIST_02 = List.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // Stream takeWhile method takes each element that matches its predicate. 
    // It stops when it get unmatched element. 
    // It returns a subset of elements that contains all matched elements, other part of stream is discarded.
    static void takeWhileMethod() {
	
	List<Integer> list = FULL_LIST_01
			.stream()
			.takeWhile(i -> (i % 2 == 0))
			.collect(toList());
	
	// This example returns an empty list because it fails at first list element, and takewhile stops here.
	out.println(list); // []
    }

    // Stream dropWhile method returns result on the basis of order of stream elements.
    static void dropWhileMethod() {
	
	List<Integer> list = FULL_LIST_02
			.stream()
			.dropWhile(i -> (i % 2 == 0))
			.collect(toList());
	
	// 
	out.println(list); // [3, 4, 5, 6, 7, 8, 9, 10]
    }    
    
    // Stream can have null values also.
    static void ofNullMethod() {
	
	Stream<Integer> value = Stream.ofNullable(null);     
	
	value.forEach(out::println); // This program will not produce any output.  
    }    
    
    
    // Stream can have null values also.
    static void iterateMethod() {
	
	Stream.iterate(1, i -> i <= 10, i -> i * 3) //
		.forEach(out::println); // 1 2 3

    }   
    
    
    public static void main(String[] args) {
	
    }
}
