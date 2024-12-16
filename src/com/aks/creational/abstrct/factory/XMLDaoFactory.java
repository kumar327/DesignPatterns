package com.aks.creational.abstrct.factory;

public class XMLDaoFactory implements DaoFactory {

	@Override
	public Dao createDao(String type) {
		switch (type) {

		case "emp":
			return new XMLEmpDao();
		case "dept":
			return new XmlDeptDao();
		default:
			throw new IllegalArgumentException("Wrong Type::" + type);
		}
	}

}
