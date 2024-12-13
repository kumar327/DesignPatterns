package com.aks.creational;

public class SingletonDateUtil {

	public SingletonDateUtil singletonDateUtil;

	private SingletonDateUtil() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("Test");
	}

}
