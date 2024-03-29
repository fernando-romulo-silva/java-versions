package org.java.versions.java09.http_client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.ResponseInfo;

class Main {


    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
	HttpRequest request = HttpRequest.newBuilder()
			  .uri(new URI("https://postman-echo.com/get"))
			  .GET()
			  .build();

	HttpResponse.BodyHandler<String> b = new HttpResponse.BodyHandler<String>() {

	    @Override
	    public BodySubscriber<String> apply(ResponseInfo responseInfo) {
		return null;
	    }
	};
	
	try (final HttpClient newHttpClient = HttpClient.newHttpClient()) {
	
	    HttpResponse<String> response = newHttpClient.send(request, b);
	}
    }
    
}
