package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	/*
	 * private static int headCount = 0; // initialize to 0 private static int
	 * rashCount = 0; // initialize to 0 private static int pupilCount = 0; //
	 * initialize to 0
	 */

	public static void main(String args[]) {

		List<String> mySymptomList = new ArrayList<String>();
		TreeMap<String, Integer> symptomsMap = new TreeMap<String, Integer>();

		/** getSymptoms is a instance of the class ReadSymptomDataFromFile. */

		ISymptomReader getSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		/** call method GetSymptoms of Class ReadSymptomDataFromFile */

		mySymptomList = getSymptoms.GetSymptoms();

		/** copySymptoms is a instance of the class CopySymptomsToMap. */

		ICopyToMap copySymptoms = new CopySymptomsToMap(mySymptomList);

		/** call method copySymptoms of class CopySymptomsToMap */

		symptomsMap = copySymptoms.copyToMap();

		/** writeSymptoms is a instance of the class WriteToFileResultOut. */

		IWriteToFile writeSymptoms = new WriteToFileResultOut(symptomsMap, "result.out");

		/* call method copyToFile of class WriteFileResultOut */

		writeSymptoms.copyToFile();

		System.out.println(symptomsMap);
	}
}
