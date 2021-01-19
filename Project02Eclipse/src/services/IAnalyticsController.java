package services;

import java.util.List;
import java.util.TreeMap;

public interface IAnalyticsController {

	/**
	 * Request to the class service ReadSymptomDataFromFile
	 * 
	 * class that read a file. and add to a ArrayList
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
	 * @param mySymptomList a ArrayList with the symptoms.
	 * 
	 * @return a TreeMap with the occurrences of symptoms.
	 */

	TreeMap<String, Integer> requestCopyToMap(List<String> myList);

	/**
	 * Request to the class service WriteToFileResultOut.
	 * 
	 * class that copy a TreeMap to a file.
	 * 
	 * @param symptomsMap a TreeMap with symptoms.
	 * 
	 * @param fileOutPath a path send to the class of service.
	 */
	void requestWriteToFile(TreeMap<String, Integer> symptomsMap, String fileOutPath);

}