package com.aks.creational.abstrct.factory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DaoFactory daoFactory = DaoProducer.createDao("db");
		Dao dao = daoFactory.createDao("dept");
		dao.save();
	}
}
