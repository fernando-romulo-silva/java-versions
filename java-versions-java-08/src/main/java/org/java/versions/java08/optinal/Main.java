package org.java.versions.java08.optinal;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Main {

    static List<String> getList01() {
	return new ArrayList<>();
    }

    static Optional<List<String>> getList02() {
	return Optional.ofNullable(null);
    }
    
    static class Address{
	String getStreet() {
	    return null;
	}
    }
    
    static class User {
	
	Address getAddress() {
	    return null;
	}
    }
    
    static User getUser() {
	return null;
    }
    
    // Optional<T> class can help to handle situations where there is a possibility of getting the NPE.
    // It works as a container for the object of type T. It can return a value of this object if this value is not a null.
    // When the value inside this container is null, it allows doing some predefined actions instead of throwing NPE.
    //
    public static void main(String[] args) {

	Optional<String> optional1 = Optional.empty();

	String str = "value";
	Optional<String> optional2 = Optional.of(str);

	Optional<String> optional3 = Optional.ofNullable(null);

	// ====================================================================

	// With pre-Java 8’s code, we need to do something like this:

	List<String> list = getList01();
	List<String> listOpt01 = list != null ? list : new ArrayList<>();

	// With Java 8, the same functionality can be achieved with a much shorter code:

	List<String> listOpt02 = getList02().orElseGet(() -> new ArrayList<>());

	// ==========================================================================
	
	Optional<User> user = Optional.ofNullable(getUser());
	String result = user.map(User::getAddress)
			.map(Address::getStreet)
			.orElse("not specified");
	
	out.println(result);
    }

}
