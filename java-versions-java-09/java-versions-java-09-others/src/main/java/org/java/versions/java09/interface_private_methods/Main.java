package org.java.versions.java09.interface_private_methods;

class Main {

    static class PrivateInterface implements Sayable {

    }

    public static void main(String[] args) {
	Sayable s = new PrivateInterface();
	s.say();
	// s.saySomething(); 
    }
}
