package com.aks.creational.factory;

public class APersonFactory {

	public static APerson getPerson(String type) {

		switch (type) {

		case "male":
			return new AMalePerson();
		case "female":
			return new AFemalePerson();
		default:
			throw new IllegalArgumentException("Wrong Type :: " + type);
		}
	}
}
