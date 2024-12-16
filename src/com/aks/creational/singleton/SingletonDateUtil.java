package com.aks.creational.singleton;

import java.io.Serializable;

public class SingletonDateUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	public static SingletonDateUtil singletonDateUtil;

	private SingletonDateUtil() {

	}

	public static SingletonDateUtil getInstance() {

		if (singletonDateUtil == null) {
			synchronized (SingletonDateUtil.class) {// Thread Safe
				if (singletonDateUtil == null) {
					singletonDateUtil = new SingletonDateUtil();
				}

			}
		}

		return singletonDateUtil;
	}

	// Serialization fix
	public Object readResolve() {
		return singletonDateUtil;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("Clone Not Supported for Single ton class");
	}

}
