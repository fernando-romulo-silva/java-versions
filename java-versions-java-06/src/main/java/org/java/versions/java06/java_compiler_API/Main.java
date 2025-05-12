package org.java.versions.java06.java_compiler_API;

import static java.lang.System.out;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Main {

	// This opened up possibilities for dynamic code generation and compilation.
	public static void main(String[] args) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		int result = compiler.run(null, null, null, "path/to/YourClass.java");

		if (result == 0) {
			out.println("Compilation succeeded!");
		} else {
			out.println("Compilation failed.");
		}
	}
}
