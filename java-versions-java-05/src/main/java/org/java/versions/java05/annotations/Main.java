package org.java.versions.java05.annotations;

import static java.lang.System.out;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class Main {

	static class Animal {

		@Deprecated
		void myDeprecatedMethod() {
			out.println("hello n");
		}

		void eatSomething() {
			out.println("eating something");
		}
	}

	static class Dog extends Animal {

		@Override
		void eatSomething() {
			out.println("eating foods");
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
}
