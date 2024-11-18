package org.java.versions.java13.file_systems_update;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        // Three new methods have been added to java.nio.file.FileSystems to make it
        // easier to use file system providers that treat the contents of a file as a
        // file system.
        //
        // * newFileSystem(Path)
        // * newFileSystem(Path, Map<String, ?>)
        // * newFileSystem(Path, Map<String, ?>, ClassLoader)

        final var zipFileName = "";
        final var create = true;

        final var path = Paths.get(zipFileName);
        final var uri = URI.create("jar:" + path.toUri());
        final var env = new HashMap<String, String>();

        if (create) {
            env.put("create", "true");
        }

        FileSystems.newFileSystem(uri, env);
    }

}
