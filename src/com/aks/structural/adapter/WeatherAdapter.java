package com.aks.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class WeatherAdapter {

	public static Map<Integer, String> city = new HashMap<>();
	static {
		city.put(12345, "Hyd");
		city.put(123456, "Bng");
		city.put(54321, "Delhi");
		city.put(6543212, "Mumbaie");

	}

	public int findTemparature(int zipCode) throws Exception {
		String city1 = city.get(zipCode);
		if (city1 != null) {
			WeatherFinder weatherFinder = new WeatherFinderImpl();

			return weatherFinder.find(city1);
		} else {
			throw new Exception("City Not found with the given zip code please enter the correct zipcode");
		}
	}
}
