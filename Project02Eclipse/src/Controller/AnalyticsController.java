package Controller;

import java.util.List;
import java.util.TreeMap;

import services.CopySymptomsToMap;
import services.IAnalyticsController;
import services.ReadSymptomDataFromFile;
import services.WriteToFileResultOut;

/**
 * Class that manage the requests to the classes of services.
 * 
 * that class implement an Interface IAnalyticsController
 * 
 * @see IAnalyticsController
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 * 
 */
public class AnalyticsController implements IAnalyticsController {

	/**
	 * An arrayList that contain symptoms
	 * 
	 * @see AnalyticsController#requestGetList(String)
	 */
	private List<String> myList;

	/**
	 * A TreeMap that contain the occurrences of symptoms
	 * 
	 * @see AnalyticsController#requestCopyToMap(List)
	 */
	private TreeMap<String, Integer> symptomsMap;

	/**
	 * method that contain calls to requests methods of the classes services
	 * 
	 */
	public void requestSymptoms() {

		requestGetList("Project02Eclipse/symptoms.txt");
		requestCopyToMap(myList);
		requestWriteToFile(symptomsMap, "result.out");
	}

	/**
	 * Request to the class service ReadSymptomDataFromFile
	 * 
	 * class that read a file and add to a ArrayList
	 * 
	 * @param filepath path of the file
	 * 
	 * @return a ArrayList with symptoms
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
	public TreeMap<String, Integer> requestCopyToMap(List<String> mySymptomList) {

		CopySymptomsToMap myCopy = new CopySymptomsToMap();
		symptomsMap = myCopy.copyToMap(mySymptomList);

		return symptomsMap;
	}

	/**
	 * Request to the class service WriteToFileResultOut.
	 * 
	 * that copy the occurrences of symptoms to a file.
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
