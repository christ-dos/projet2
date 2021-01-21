package services;

import java.util.List;
import java.util.TreeMap;

/**
 * An Interface that manage the requests to Controller
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 * 
 */
public interface IAnalyticsController {

	/**
	 * Request to the class service ReadSymptomDataFromFile
	 * 
	 * class that read a file. and add to a ArrayList
	 * 
	 * @see ReadSymptomDataFromFile
	 * 
	 * @param filepath path of the file
	 * 
	 * @return a ArrayList.
	 */

	List<String> requestGetList(String filepath);

	/**
	 * Request to the class service CopySymptomsToMap.
	 * 
	 * Class that count the occurrences of elements and copy to a TreeMap.
	 * 
	 * @see CopySymptomsToMap
	 * 
	 * @param myList a ArrayList with the symptoms.
	 * 
	 * @return a TreeMap with the occurrences of symptoms.
	 */

	TreeMap<String, Integer> requestCopyToMap(List<String> myList);

	/**
	 * Request to the class service WriteToFileResultOut.
	 * 
	 * class that copy a TreeMap to a file.
	 * 
	 * @see WriteToFileResultOut
	 * 
	 * @param symptomsMap a TreeMap with symptoms.
	 * 
	 * @param fileOutPath a path send to the class of service.
	 */
	void requestWriteToFile(TreeMap<String, Integer> symptomsMap, String fileOutPath);

}