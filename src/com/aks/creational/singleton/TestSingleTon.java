package com.aks.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleTon {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// Eger Test
		EgerSingleTon e1 = EgerSingleTon.egerSingleTon;
		EgerSingleTon e2 = EgerSingleTon.egerSingleTon;
		if (e1 == e2) {
			System.out.println("Eger Same Object");
		} else {
			System.out.println("Eger Different Object");
		}

		// Lazy Single Ton
		SingletonDateUtil s1 = SingletonDateUtil.getInstance();
		SingletonDateUtil s2 = SingletonDateUtil.getInstance();
		if (s1 == s2) {
			System.out.println("Lazy Same Object");
		} else {
			System.out.println("lazy Different Object");
		}

//		By using Input out put stream
		SingletonDateUtil s3 = SingletonDateUtil.getInstance();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(
				new File("/Users/a.kumaraswamy/Desktop/Study/Java/DesignPatterns/CoreDesignPatterns/dateutil.ser")));
		objectOutputStream.writeObject(s3);
		SingletonDateUtil s4 = null;
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(
				new File("/Users/a.kumaraswamy/Desktop/Study/Java/DesignPatterns/CoreDesignPatterns/dateutil.ser")));
		s4 = (SingletonDateUtil) objectInputStream.readObject();
		
		if (s3 == s4) {
			System.out.println("Lazy with sirlization Same Object");
		} else {
			System.out.println("lazy with sirlization Different Object");
		}
	}
}
