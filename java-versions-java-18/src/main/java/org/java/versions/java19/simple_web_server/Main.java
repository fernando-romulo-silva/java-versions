package org.java.versions.java19.simple_web_server;

import java.net.InetSocketAddress;
import java.nio.file.Path;

import static java.lang.System.out;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.util.function.Predicate;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpHandlers;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.Request;
import com.sun.net.httpserver.SimpleFileServer;

public class Main {

    // The easiest way to start the provided webserver is the jwebserver command.
    //
    // It starts the server on localhost:8000 and provides a file browser for the
    // current directory:
    //
    // $ jwebserver
    //
    // Binding to loopback by default.
    // For all interfaces use "-b 0.0.0.0" or "-b ::".
    // Serving /home/sven and subdirectories on 127.0.0.1 port 8000
    // URL http://127.0.0.1:8000/
    //
    // The easiest way to start the provided webserver is the jwebserver command.
    // It starts the server on localhost:8000 and provides a file browser for the
    // current directory:
    // $ jwebserver -b 127.0.0.100 -p 4444 -d /tmp -o verbose
    // Serving/tmp and subdirectories on 127.0.0.100port 4444
    // URL http:// 127.0.0.100:4444/
    //
    //
    //
    // Java API: SimpleFileServer
    public static void main(String[] args) {

        // This command calls the main() method of the
        // sun.net.httpserver.simpleserver.Main class of the jdk.httpserver module,
        // which, in turn, calls SimpleFileServerImpl.start(…).
        //
        // This starter evaluates the command line parameters and finally creates the
        // server via SimpleFileServer.createFileServer(…).
        //
        //
        WebServer webServer = new WebServer();
        HttpServer server = webServer.createWithHandler401Response();
        server.start();
    }

    public static class WebServer {

        private final InetSocketAddress address = new InetSocketAddress(8080);

        private final Path path = Path.of("/");

        private HttpServer createBasic() {
            return SimpleFileServer.createFileServer(address, path, SimpleFileServer.OutputLevel.VERBOSE);
        }

        private HttpServer createWithHandler() throws IOException {
            HttpServer server = SimpleFileServer.createFileServer(address, path, SimpleFileServer.OutputLevel.VERBOSE);
            HttpHandler handler = SimpleFileServer.createFileHandler(Path.of("/Users"));
            server.createContext("/test", handler);
            return server;
        }

        private HttpServer createWithHandler401Response() {
            Predicate<Request> findAllowedPath = r -> r.getRequestURI()
                    .getPath()
                    .equals("/test/allowed");

            HttpHandler allowedResponse = HttpHandlers.of(200, Headers.of("Allow", "GET"), "Welcome");
            HttpHandler deniedResponse = HttpHandlers.of(401, Headers.of("Deny", "GET"), "Denied");

            HttpHandler handler = HttpHandlers.handleOrElse(findAllowedPath, allowedResponse, deniedResponse);

            HttpServer server = SimpleFileServer.createFileServer(address, path, SimpleFileServer.OutputLevel.VERBOSE);
            server.createContext("/test", handler);
            return server;
        }

        private HttpServer createWithFilter() throws IOException {
            Filter filter = SimpleFileServer.createOutputFilter(out, SimpleFileServer.OutputLevel.INFO);
            HttpHandler handler = SimpleFileServer.createFileHandler(Path.of("/Users"));
            return HttpServer.create(new InetSocketAddress(8080), 10, "/test", handler, filter);
        }
    }
}
