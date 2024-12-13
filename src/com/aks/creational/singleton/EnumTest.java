package com.aks.creational.singleton;

public class EnumTest {

	public static void main(String[] args) {
		EnumSingleTon e1 = EnumSingleTon.INSTANCE;
		EnumSingleTon e2 = EnumSingleTon.INSTANCE;

		System.out.println(e1.getName());
		e1.setName("Kumar");
		System.out.println(e1.getName());

		if (e1 == e2) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
}
