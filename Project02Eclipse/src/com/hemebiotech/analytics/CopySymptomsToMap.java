package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * A class that copy the symptoms to a TreeMap to obtain the symptoms in
 * alphabetic order and them occurrences.
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 1.0
 * 
 */

public class CopySymptomsToMap {

	private List<String> mySymptomList;

	/**
	 * 
	 * @param mySymptomList
	 */
	public CopySymptomsToMap(List<String> mySymptomList) {
		this.mySymptomList = mySymptomList;
	}

	/**
	 * Method that copy the symptoms to a TreeMap.
	 * 
	 * The method .merge() insert the key/value not present in the TreeMap and
	 * update the values of the keys present in the TreeMap with a Lambda function
	 * sum.
	 * 
	 * @param mySymptomList a List passed to the method that may contain many
	 *                      duplication.
	 * 
	 * @return a TreeMap with symptoms sort in alphabetic order with the occurrences
	 *         of them.
	 */

	public TreeMap<String, Integer> copyToMap() {

		TreeMap<String, Integer> symptomsMap = new TreeMap<String, Integer>();

		mySymptomList.stream().forEach(symptoms -> {
			symptomsMap.putIfAbsent(symptoms, 0);
			symptomsMap.computeIfPresent(symptoms, (key, valeur) -> valeur + 1);
		});

		/*
		 * List<String> symptoms = mySymptomList.stream().collect(toList());
		 * 
		 * System.out.println(symptoms);
		 */
		/*
		 * for (String key : mySymptomList) {
		 * 
		 * symptomsMap.merge(key, 1, Integer::sum);
		 * 
		 * }
		 */

		return symptomsMap;

	}

}
