package org.java.versions.java16.unix_domain_socket_channels;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;

public class Main {

    // Unix-domain sockets are used for inter-process communication (IPC) within a
    // host.
    //
    // They are similar to TCP/IP sockets but are addressed via file system paths,
    // not IP addresses.
    //
    // They are more secure (no access possible from outside the
    // host) and provide faster connection initiation and higher throughput than
    // TCP/IP loopback connections.

    public static void tcpServer() throws IOException {
        // The following (very rudimentary) example shows how to open a TCP/IP server
        // socket on port 8080 and how a client connects to that server:

        final var socketAddress = new InetSocketAddress(8080);

        // Server
        final var serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(socketAddress);

        // Client
        final var socketChannel = SocketChannel.open();
        final var remoteAddress = new SocketAddress() {

        };

        //
        socketChannel.connect(remoteAddress);
    }

    // And here is the analogous example using the Unix-domain socket path
    // "~/happycoders.socket":
    public static void unixServer() throws IOException {
        var socketPath = Path.of(System.getProperty("user.home")).resolve("happycoders.socket");
        var socketAddress = UnixDomainSocketAddress.of(socketPath);

        // Server
        var serverSocketChannel = ServerSocketChannel.open(StandardProtocolFamily.UNIX);
        serverSocketChannel.bind(socketAddress);

        // Client
        var socketChannel = SocketChannel.open(StandardProtocolFamily.UNIX);
        final var remoteAddress = new SocketAddress() {

        };
        socketChannel.connect(remoteAddress);
    }
}
