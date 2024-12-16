package com.aks.creational.abstrct.factory;

public class DaoProducer {

	public static DaoFactory createDao(String type) {
		switch (type) {
		case "xml":
			return new XMLDaoFactory();
		case "db":
			return new DBDaoFactory();
		default:
			throw new IllegalArgumentException("Wrong Type::" + type);
		}
	}
}
