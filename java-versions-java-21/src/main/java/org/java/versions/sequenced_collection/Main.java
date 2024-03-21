package org.java.versions.sequenced_collection;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

class Main {

    public static void main(String[] args) {
	
	// These new interfaces are:
        // 
	// SequencedCollection
	// SequencedSet
	// SequencedMap
	
	
	// Prior to JDK 21, retrieving the first and last elements of collections in Java involved different methods and approaches depending on the collection type.
	// Let’s examine some examples of accessing the first and last elements using the pre-JDK 21 JDK API calls:
	//
	// =====================================================================================
	// List
	final var list = List.of(1, 2, 3, 4, 5, 6);
	
	//First Element 
	list.get(0);
	
	// Last Element 
	list.get(list.size()-1);
	
	// now
	list.getFirst();
	list.getLast();

	// =====================================================================================
	// Deque
	final var deque = new ArrayDeque<Integer>(list);
	
	// First Element 
	deque.getFirst();
	
	// Last Element 
	deque.getLast();
	
	// now, no changes
	
	// =====================================================================================
	// Set
	
	final var set = new LinkedHashSet<>(list);
	// First Element
	set.iterator().next();
	// or
	set.stream().findFirst().get();
	
	// Last Element 
	// requires iterating through the set
	
	// now
	set.getFirst();
	set.getLast();
	
	// =====================================================================================
	// Map
	
	final var map = new LinkedHashMap<Integer, String>();
	map.put(1,"value01");
	map.put(2,"value02");
	
	map.firstEntry();
	map.lastEntry();
	
	
    }

}
