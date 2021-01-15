package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ICopyToMap {

	/**
	 * Anything that will copy to a TreeMap.
	 * 
	 * The important part is, the return value from the operation, which is a
	 * TreeMap with a String Key and an Integer value
	 * 
	 * The elements copied are ordered
	 * 
	 */

	TreeMap<String, Integer> copyToMap();

}