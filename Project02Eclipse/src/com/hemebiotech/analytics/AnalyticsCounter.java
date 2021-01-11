package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	private static int headCount = 0; // initialize to 0
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0

	public static void main(String args[]) throws Exception {

		List<String> mySymptomList = new ArrayList<String>();
		TreeMap<String, Integer> symptomsMap = new TreeMap<String, Integer>();

		/** getSymptoms is a instance of the class ReadSymptomDataFromFile. */

		ReadSymptomDataFromFile getSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		/** call method GetSymptoms of Class ReadSymptomDataFromFile */

		mySymptomList = getSymptoms.GetSymptoms();

		/** writeSymptoms is a instance of the class WriteToFileResultOut. */

		WriteToFileResultOut writeSymptoms = new WriteToFileResultOut(symptomsMap, "result.out");

		/* call method copyToFile of class WriteFileResultOut */

		writeSymptoms.copyToFile(symptomsMap);

		System.out.println(mySymptomList);
		// next generate output
		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
