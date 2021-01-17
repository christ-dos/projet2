package services;

import java.util.TreeMap;

/**
 * 
 * @author Christine Dos Santos Duarte
 *
 */
public interface IWriteToFile {

	/**
	 * Anything that will write in something.
	 * 
	 * The important part is, the return value from the operation, which is a
	 * TreeMap with a String Key and an Integer value.
	 * 
	 * @return The elements copied in order
	 * 
	 */
	TreeMap<String, Integer> copyToFile(TreeMap<String, Integer> symptomsMap);

}