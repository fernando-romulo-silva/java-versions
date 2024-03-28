package org.java.versions.java09.interface_private_methods;

import static java.lang.System.out;

interface Sayable {
    
    default void say() {
	saySomething();
	sayPolitely();
    }

    // Private method inside interface
    private void saySomething() {
	out.println("Hello... I'm private method");
    }
    
    private static void sayPolitely() {  
        out.println("I'm private static method");  
    }  
}
