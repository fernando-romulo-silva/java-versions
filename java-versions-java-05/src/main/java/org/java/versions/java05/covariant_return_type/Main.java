package org.java.versions.java05.covariant_return_type;

import org.java.versions.java05.covariant_return_type.Main.A;
import org.java.versions.java05.covariant_return_type.Main.B1;

class Main {

	static class A {

		A get() {
			return this;
		}
	}

	static class B1 extends A {

		@Override
		B1 get() { // change the return type
			return this;
		}

		void message() {
			System.out.println("welcome to covariant return type");
		}
	}

	public static void main(String args[]) {
		new B1().get().message();
	}
}
