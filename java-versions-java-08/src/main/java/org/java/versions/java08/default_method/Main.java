package org.java.versions.java08.default_method;

class Main {

    
    public static void main(String[] args) {
	
	final Shape rectangle = new Rectangle();
	rectangle.printShapeType("rectangle");
	
	
	final Shape square = new Square(3);
	square.printShapeType("square");	
    }
    
    
}
