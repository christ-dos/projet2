package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounter {
	private static int headCount = 0; // initialize to 0
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0

	public static void main(String args[]) throws Exception {

		List<String> mySymptomList = new ArrayList<String>();

		ReadSymptomDataFromFile getSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		mySymptomList = getSymptoms.GetSymptoms();

		// BufferedReader reader = new BufferedReader(new
		// FileReader("Project02Eclipse\\symptoms.txt"));

		/*
		 * String line = reader.readLine();
		 * 
		 * while (line != null) {
		 * 
		 * System.out.println("symptom from file: " + line); if
		 * (line.equals("headache")) { headCount++;
		 * System.out.println("number of headaches: " + headCount); } else if
		 * (line.equals("rash")) { rashCount++; } else if (line.contains("pupils")) {
		 * pupilCount++; }
		 * 
		 * line = reader.readLine(); // get another symptom
		 * 
		 * }
		 * 
		 * reader.close();
		 */

		System.out.println(mySymptomList);
		// next generate output
		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
