package services;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * A class that copy the symptoms to a TreeMap to obtain the symptoms in
 * alphabetic order and them occurrences. and that implement ICopyToMap
 * Interface.
 * 
 * @author Christine Dos Santos Duarte
 * 
 */
public class CopySymptomsToMap implements ICopyToMap {

	/**
	 * Method that copy the symptoms to a TreeMap.
	 * 
	 * 
	 * @param mySymptomList a List passed to the method that may contain many
	 *                      duplication.
	 * 
	 * @return a TreeMap with symptoms sort in alphabetic order with the occurrences
	 *         of them.
	 * 
	 */

	@Override
	public TreeMap<String, Integer> copyToMap(List<String> mySymptomList) {

		TreeMap<String, Integer> symptomsMap = new TreeMap<>();

		if (mySymptomList != null) {

			mySymptomList.forEach(symptom -> {
				symptomsMap.putIfAbsent(symptom, Collections.frequency(mySymptomList, symptom));
			});
		}
		return symptomsMap;
	}
}
