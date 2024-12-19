package com.aks.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class WeatherFinderImpl implements WeatherFinder {

	public static Map<String, Integer> temparature = new HashMap<>();
	static {
		temparature.put("Hyd", 38);
		temparature.put("Bng", 35);
		temparature.put("Delhi", 50);
		temparature.put("Mumbaie", 45);

	}

	@Override
	public int find(String city) {
		return temparature.get(city) != null ? temparature.get(city) : -1;

	}

}
