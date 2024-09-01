package org.java.versions.java09.java_version_string;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {

		Runtime.Version version = Runtime.version(); // Getting runtime version instance

		out.println("Current version is " + version); // Getting current Java version
		out.println("Major version number " + version.major()); // Getting major version number
		out.println("Minor version number " + version.minor()); // Getting minor version number
		out.println("Security version number " + version.security()); // Getting security version number
		out.println("Pre-released information " + version.pre()); // Getting pre-release version information
		out.println("Build Number " + version.build()); // Getting Optional build number
	}
}
