package org.java.versions.java19.internet_address_resolution_spi;

import static java.lang.System.out;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    // To find out the IP address(es) for a hostname in Java, we can use
    // InetAddress.getByName(…) or InetAddress.getAllByName(…).
    // Here is an example:

    public static void main(String[] args) throws Exception {

        final var addresses = InetAddress.getAllByName("www.happycoders.eu");

        out.println("addresses = " + Arrays.toString(addresses));

        // JDK Enhancement Proposal 418 introduces a Service Provider Interface (SPI) to
        // allow the platform's built-in default resolver to be replaced by other
        // resolvers.

        class HappyCodersInetAddressResolver implements InetAddressResolver {

            @Override
            public Stream<InetAddress> lookupByName(String host, LookupPolicy lookupPolicy)
                    throws UnknownHostException {
                return Stream.of(InetAddress.getByAddress(new byte[] { 127, 0, 0, 1 }));
            }

            @Override
            public String lookupByAddress(byte[] addr) {
                throw new UnsupportedOperationException();
            }
        }

        class HappyCodersInetAddressResolverProvider extends InetAddressResolverProvider {

            @Override
            public InetAddressResolver get(Configuration configuration) {
                return new HappyCodersInetAddressResolver();
            }

            @Override
            public String name() {
                return "HappyCoders Internet Address Resolver Provider";
            }
        }

        // The provider creates a new instance of the previously implemented resolver in
        // the get() method.
        //
        // In the third step, we have to register the resolver.
        //
        // To do this, we create a file in the META-INF/services directory with the name
        // java.net.spi.InetAddressResolverProvider and the following content:
        // eu.happycoders.jep416.HappyCodersInetAddressResolverProvider
        //
        final var addressesNew = InetAddress.getAllByName("www.happycoders.eu");
        out.println("addresses = " + Arrays.toString(addressesNew));
    }
}
