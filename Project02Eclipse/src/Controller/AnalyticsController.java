package Controller;

import java.util.List;
import java.util.TreeMap;

import services.CopySymptomsToMap;
import services.IAnalyticsController;
import services.ReadSymptomDataFromFile;
import services.WriteToFileResultOut;

/**
 * Class that manage the requests.
 * 
 * @author Christine Dos Santos Duarte
 *
 */
public class AnalyticsController implements IAnalyticsController {

	List<String> myList;
	TreeMap<String, Integer> symptomsMap;

	/**
	 * method that contain calls to requests methods of the classes services
	 */
	public void requestSymptoms() {

		requestGetList("Project02Eclipse/symptoms.txt");
		requestCopyToMap(myList);
		requestWriteToFile(symptomsMap, "result.out");
	}

	/**
	 * Request to the class service ReadSymptomDataFromFile
	 * 
	 * class that read a file. and add to a ArrayList
	 * 
	 * @param filepath path of the file
	 * 
	 * @return a ArrayList.
	 */

	@Override
	public List<String> requestGetList(String filepath) {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
		myList = reader.GetSymptoms();

		return myList;
	}

	/**
	 * Request to the class service CopySymptomsToMap.
	 * 
	 * Class that count the occurrences of elements and copy to a TreeMap.
	 * 
	 * @param mySymptomList a ArrayList with the symptoms.
	 * 
	 * @return a TreeMap with the occurrences of symptoms.
	 */

	@Override
	public TreeMap<String, Integer> requestCopyToMap(List<String> myList) {

		CopySymptomsToMap myCopy = new CopySymptomsToMap();
		symptomsMap = myCopy.copyToMap(myList);

		return symptomsMap;
	}

	/**
	 * Request to the class service WriteToFileResultOut.
	 * 
	 * class that copy a TreeMap to a file.
	 * 
	 * @param symptomsMap a TreeMap with symptoms.
	 * 
	 * @param fileOutPath a path send to the class of service.
	 */
	@Override
	public void requestWriteToFile(TreeMap<String, Integer> symptomsMap, String fileOutPath) {

		WriteToFileResultOut writer = new WriteToFileResultOut(fileOutPath);
		writer.copyToFile(symptomsMap);

		System.out.println(symptomsMap);

	}

}
