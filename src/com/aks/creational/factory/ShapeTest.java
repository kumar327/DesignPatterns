package com.aks.creational.factory;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape("Circle");
		shape.draw();
	}
}
