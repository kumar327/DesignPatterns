package com.aks.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// Without Builder
		HttpClient h1 = new HttpClient("Post", "http://localhost/save", null, null, "{}", null);

		System.out.println(h1);

		// With Builder Patter

		HttpClient h2 = new HttpClient.HttpClientBuilder().method("GET").url("http://localhost:8081/get")
				.secure("Kumar", "1234").body("{}").build();
		System.out.println(h2);
	}
}
