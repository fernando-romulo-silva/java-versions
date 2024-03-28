package org.java.versions.java08.base64;

import static java.lang.System.out;

import java.util.Base64;

class Main {
    
    // Java provides a class Base64 to deal with encryption.
    // You can encrypt and decrypt your data by using provided methods. 

    public static void main(String[] args) {
	
	// Getting encoder
	Base64.Encoder encoder = Base64.getUrlEncoder();
	
	// Encoding URL
	String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
	out.println("Encoded URL: " + eStr);
	
	// Getting decoder
	Base64.Decoder decoder = Base64.getUrlDecoder();
	
	// Decoding URl
	String dStr = new String(decoder.decode(eStr));
	out.println("Decoded URL: " + dStr);
    }

}
