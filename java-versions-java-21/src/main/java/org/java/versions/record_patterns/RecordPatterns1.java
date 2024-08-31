package org.java.versions.record_patterns;

import static java.lang.System.out;

class RecordPatterns1 {

	public static void checkValue(final Object object) {

		// Pattern matching with a type pattern using instanceof
		if (object instanceof String string) {
			// ... use s ...
			out.println("Value: " + string);
		}

	}

}
