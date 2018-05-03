package com.distraction.it;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	
	private Utils() {}
	
	public static final int clamp(int val, int constraint1, int constraint2) {
		return constraint1 < constraint2 ?
				val < constraint1 ? constraint1 : val > constraint2 ? constraint2 : val :
					val < constraint2 ? constraint2 : val > constraint1 ? constraint1 : val;
	}
	
	public static final <T> List<T> createList(T... args) {
		List<T> list = new ArrayList<>();
		for (T arg : args) {
			list.add(arg);
		}
		return list;
	}
	
}
