package Controller;

import java.util.List;
import java.util.TreeMap;

import services.CopySymptomsToMap;
import services.ReadSymptomDataFromFile;
import services.WriteToFileResultOut;

/**
 * Class that manage the requests.
 * 
 * @author Christine Dos Santos Duarte
 *
 */
public class AnalyticsController {

	List<String> myList;
	TreeMap<String, Integer> symptomsMap;

	/**
	 * method that contain the requests at the classes services
	 */
	public void requestSymptoms() {

		requestGetList("Project02Eclipse/symptoms.txt");
		requestCopyToMap(myList);
		requestWriteToFile(symptomsMap, "result.out");
	}

	/**
	 * Request to the class service ReadSymptomDataFromFile
	 * 
	 * @param filepath path of the file
	 * 
	 * @return a ArrayList.
	 */

	public List<String> requestGetList(String filepath) {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
		myList = reader.GetSymptoms();

		return myList;
	}

	/**
	 * Request to the class service CopySymptomsToMap.
	 * 
	 * @param mySymptomList a ArrayList with the symptoms.
	 * 
	 * @return a TreeMap with the occurrences of symptoms.
	 */

	public TreeMap<String, Integer> requestCopyToMap(List<String> myList) {

		CopySymptomsToMap myCopy = new CopySymptomsToMap();
		symptomsMap = myCopy.copyToMap(myList);

		return symptomsMap;
	}

	/**
	 * Request to the class service WriteToFileResultOut.
	 * 
	 * @param symptomsMap a TreeMap with symptoms.
	 * 
	 * @param fileOutPath a path send to the class of service.
	 */
	public void requestWriteToFile(TreeMap<String, Integer> symptomsMap, String fileOutPath) {

		WriteToFileResultOut writer = new WriteToFileResultOut(fileOutPath);
		writer.copyToFile(symptomsMap);

		System.out.println(symptomsMap);

	}

}
