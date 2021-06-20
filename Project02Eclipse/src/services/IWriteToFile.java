package services;

import java.util.TreeMap;

/**
 * Anything that will write symptom data in a file.
 * 
 * The important part is, the return value from the operation, which is a
 * TreeMap with the symptoms and their occurrences.
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 *
 */
public interface IWriteToFile {

	/**
	 * Anything that will write in a file.
	 * 
	 * The important part is, the return value from the operation, which is a
	 * TreeMap with a String Key and an Integer value.
	 * 
	 * @param symptomsMap A TreeMap that contain the occurrences of them
	 * 
	 * @return The elements copied in order
	 * 
	 */
	TreeMap<String, Integer> copyToFile(TreeMap<String, Integer> symptomsMap);

}