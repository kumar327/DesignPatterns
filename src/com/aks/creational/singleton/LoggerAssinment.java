package com.aks.creational.singleton;

public class LoggerAssinment implements Cloneable {

	public static LoggerAssinment instance;

	private LoggerAssinment() {

	}

	public static LoggerAssinment getInstance() {

		if (instance == null) {
			synchronized (LoggerAssinment.class) {
				if (instance == null) {
					instance = new LoggerAssinment();
				}
			}
		}
		return instance;
	}

	public void log(String message) {
		System.out.println("Messaged Logged:: " + message);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("For Singleton class Clone not supported");
	}

}
