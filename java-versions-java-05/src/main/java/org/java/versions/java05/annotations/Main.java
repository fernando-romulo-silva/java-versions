package org.java.versions.java05.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

class Main {

	static class Animal {

		@Deprecated
		void myDeprecatedMethod() {
			System.out.println("hello n");
		}

		void eatSomething() {
			System.out.println("eating something");
		}
	}

	static class Dog extends Animal {

		@Override
		void eatSomething() {
			System.out.println("eating foods");
		}
	}

	// ====================================================================
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Inherited
	static @interface MyAnnotation {
	}

	static class MyClass {

		@MyAnnotation
		void myMethod() {

		}
	}

	public static void main(String[] args) {

		new ArrayList<Integer>() {
			{
				add(1);
				add(2);
			}
		};
	}
}
