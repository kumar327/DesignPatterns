package com.aks.creational.factory;

public class APersonTest {

	public static void main(String[] args) {
		APerson p = APersonFactory.getPerson("male");
		p.wish();
	}
}
