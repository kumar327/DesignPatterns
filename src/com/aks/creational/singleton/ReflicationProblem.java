package com.aks.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflicationProblem {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonDateUtil s1 = SingletonDateUtil.getInstance();
		SingletonDateUtil s2 = null;
		Constructor[] constructors = SingletonDateUtil.class.getConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			s2 = (SingletonDateUtil) constructor.newInstance();
		}

		if (s1 == s2) {
			System.out.println("Lazy Refelcation Same Object");
		} else {
			System.out.println("lazy Refelection Different Object");
		}

	}
}
