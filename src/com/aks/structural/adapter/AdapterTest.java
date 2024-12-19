package com.aks.structural.adapter;

public class AdapterTest {

	public static void main(String[] args) throws Exception {
		WeatherUI weatherUI = new WeatherUI();
		int temp = weatherUI.find(1234556789);
		System.out.println(temp);
	}
}
