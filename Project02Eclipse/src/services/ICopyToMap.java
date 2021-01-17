package services;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * @author Christine Dos Santos Duarte
 *
 */

public interface ICopyToMap {

	/**
	 * Anything that will copy to a TreeMap .
	 * 
	 * The important part is, the return value from the operation, which is a
	 * TreeMap with a String Key and an Integer value.
	 * 
	 * @return The elements copied in order
	 * 
	 */
	TreeMap<String, Integer> copyToMap(List<String> mySymptomList);

}