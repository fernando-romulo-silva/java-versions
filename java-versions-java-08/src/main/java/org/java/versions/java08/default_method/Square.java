package org.java.versions.java08.default_method;

import static java.lang.System.out;

class Square implements Shape {
    private float side;

    Square(float side) {
	this.side = side;
    }

    @Override
    public void printShapeType(String type) {
	out.println("Now the shape is : " + type);
    }
}
