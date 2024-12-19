package com.aks.structural.adapter;

public class WeatherUI {

	public int find(int zipCode) throws Exception {
		WeatherAdapter weatherAdapter = new WeatherAdapter();
		return weatherAdapter.findTemparature(zipCode);
	}
}
