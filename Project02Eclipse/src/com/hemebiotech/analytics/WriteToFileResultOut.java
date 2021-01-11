package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
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
	}

	/**
	 * method that write to the file result.out.
	 * 
	 * @param symptomCopieToMap a TreeMap that contain the symptoms and occurrences
	 *                          of them.
	 * 
	 * @throws IOException if the file does not write well in the file.
	 *
	 * @return symptomCopieToMap a Map with the resume of symptoms.
	 */

	public TreeMap<String, Integer> copyToFile(TreeMap<String, Integer> symptomCopieToMap) throws IOException {

		FileWriter writer = new FileWriter((filepath));

		try {

			for (Map.Entry<String, Integer> entry : symptomCopieToMap.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				writer.write(key + " = " + value + "\n");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		writer.close();

		return symptomCopieToMap;
	}

}
