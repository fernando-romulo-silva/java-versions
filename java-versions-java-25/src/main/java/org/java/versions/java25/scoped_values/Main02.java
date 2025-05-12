package org.java.versions.java24.scoped_values;

import static java.lang.System.out;

import java.util.concurrent.StructuredTaskScope;

class Main02 {

	private static final ScopedValue<String> CONTEXT = ScopedValue.newInstance();

	public static void main(String[] args) {

		ScopedValue.runWhere(CONTEXT, "TestValue", () -> {

			insideChildThread();

			try (var scope = new StructuredTaskScope<String>()) {

				scope.fork(Main02::insideParentThread_1);
				scope.fork(Main02::insideParentThread_2);

				scope.join();

			} catch (final InterruptedException ex) {
				ex.printStackTrace();
			}
		});
	}

	static String insideParentThread_1() {
		final var msg = "ThreadLocal Value in insideParentThread_1(): " + CONTEXT.get();
		out.println(msg);
		return msg;
	}

	static String insideParentThread_2() {
		final var msg = "ThreadLocal Value in insideParentThread_2(): " + CONTEXT.get();
		out.println(msg);
		return msg;
	}

	static String insideChildThread() {
		final var msg = "ThreadLocal Value in insideChildThread(): " + CONTEXT.get();
		out.println(msg);
		return msg;
	}

}
