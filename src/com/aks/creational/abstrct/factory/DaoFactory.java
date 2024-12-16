package com.aks.creational.abstrct.factory;

public interface DaoFactory {

	Dao createDao(String type);
}
