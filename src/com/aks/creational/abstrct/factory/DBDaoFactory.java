package com.aks.creational.abstrct.factory;

public class DBDaoFactory implements DaoFactory {

	@Override
	public Dao createDao(String type) {
		switch (type) {
		case "emp":
			return new DBEmpDao();
		case "dept":
			return new DBDeptDao();
		default:
			throw new IllegalArgumentException("Wrong Type::" + type);
		}
	}

}
