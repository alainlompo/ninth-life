package org.lompo.dive.deep.ninth.life.httpclient;

import java.net.URI;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class Http2GetDemo {
	public static void main(String[] args) throws Exception {
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder(new URI("http://httpbin.org/get"))
				.GET()
				.version(HttpClient.Version.HTTP_1_1)
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Response body:");
		System.out.println(response.body());
	}

}
