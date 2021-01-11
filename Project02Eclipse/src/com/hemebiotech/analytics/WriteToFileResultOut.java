package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Class that write to the file result.out
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version
 * 
 */

public class WriteToFileResultOut {
	private String filepath;
	private TreeMap<String, Integer> symptomsMap;

	/**
	 * Constructor of WriteToFileResultOut
	 * 
	 * @param filepath a full or partial path to the file to write the results
	 * 
	 *
	 * 
	 */

	public WriteToFileResultOut(TreeMap<String, Integer> symptomsMap, String filepath) {

		this.filepath = filepath;
		this.symptomsMap = symptomsMap;
	}

	/**
	 * method that write to the file result.out.
	 * 
	 * @param symptomsMap a TreeMap that contain the symptoms and occurrences of
	 *                    them.
	 * 
	 * @throws IOException if the file does not write well in the file.
	 *
	 * @return symptomCopieToMap a Map with the resume of symptoms.
	 */

	public void copyToFile() {

		try (FileWriter writer = new FileWriter((filepath))) {
			symptomsMap.forEach((k, v) -> {
				try {
					writer.write(k + " = " + v + "\n");
				} catch (IOException e) {

					e.printStackTrace();
				}
			});
		} catch (IOException e) {

			e.printStackTrace();
		}

		// return symptomsMap;
	}

	// public TreeMap<String, Integer> getSymptomsMap() {
	// return this.symptomsMap;
	// }

}
