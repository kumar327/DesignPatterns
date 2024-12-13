package com.aks.creational.singleton;

public class EgerSingleTon {

	//First Way
//	public static EgerSingleTon egerSingleTon=new EgerSingleTon();

	
	// Second way to create Singleton
	public static EgerSingleTon egerSingleTon;
	static {
		egerSingleTon = new EgerSingleTon();
	}

}
