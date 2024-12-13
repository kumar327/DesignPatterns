package com.aks.creational.singleton;

public class SingletonDateUtil {

	public static SingletonDateUtil singletonDateUtil;

	private SingletonDateUtil() {

	}

	public static SingletonDateUtil getInstance() {
		if (singletonDateUtil == null) {
			singletonDateUtil = new SingletonDateUtil();
		}

		return singletonDateUtil;
	}

	public static void main(String[] args) {
		SingletonDateUtil s1 = SingletonDateUtil.getInstance();
		SingletonDateUtil s2 = SingletonDateUtil.getInstance();
		if (s1 == s2) {
			System.out.println("Same Object");
		} else {
			System.out.println("Different Object");
		}
	}

}
