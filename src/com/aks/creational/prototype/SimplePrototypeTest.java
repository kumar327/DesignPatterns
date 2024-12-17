package com.aks.creational.prototype;

public class SimplePrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Game g1 = new Game();
		g1.setId(1);
		g1.setName("Kumar");
		g1.setMemberShip(new MemberShip());
		Game g2 = g1.clone();
		System.out.println(g1);
		System.out.println(g2);
	}
}
