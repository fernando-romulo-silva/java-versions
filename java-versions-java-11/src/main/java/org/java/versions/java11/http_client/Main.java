package org.java.versions.java11.http_client;

import static java.lang.System.out;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.ResponseInfo;

class Main {
    
    // While working on the HTTP resources with Java, we widely used third-party libraries like Apache HttpClient, Jetty etc.
    // Java provide support using HttpURLConnection API which is not known as feature rich and user-friendly as compared to these third-party libraries.

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
	final var request = HttpRequest.newBuilder().uri(new URI("https://postman-echo.com/get")).GET().build();

	HttpResponse.BodyHandler<String> b = (final ResponseInfo responseInfo) -> {
	    out.print(responseInfo);
	    return null;
	};

	final var newHttpClient = HttpClient.newHttpClient();

	HttpResponse<String> response = newHttpClient.send(request, b);

	out.println(response);
    }

}
