package services;

import java.util.List;
import java.util.TreeMap;

/**
 * Anything that will copy to a TreeMap symptom data from a source .
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 * 
 */
public interface ICopyToMap {

	/**
	 * Anything that will copy to a TreeMap .
	 * 
	 * The important part is, the return value from the operation, which is a
	 * TreeMap with a String Key and an Integer value.
	 * 
	 * @param mySymptomList an ArrayList that contain the symptoms
	 * 
	 * @return The elements copied in alphabetic order.
	 * 
	 */
	TreeMap<String, Integer> copyToMap(List<String> mySymptomList);

}