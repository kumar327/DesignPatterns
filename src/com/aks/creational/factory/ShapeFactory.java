package com.aks.creational.factory;

public class ShapeFactory {

	public static Shape getShape(String shapeName) {

		switch (shapeName) {
		case "Circle": {
			return new CircleShape();
		}
		case "rectanguler": {
			return new RectangulerShape();
		}
		case "squre": {
			return new SqureShape();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + shapeName);
		}

	}
}
