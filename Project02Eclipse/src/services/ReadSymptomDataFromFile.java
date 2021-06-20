package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * 
 * @see ISymptomReader
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * This attribute is a full or partial path that permit to find the file that
	 * contain the listing of symptoms.
	 * 
	 * @see ReadSymptomDataFromFile#GetSymptoms()
	 * 
	 */
	private String filepath;

	/**
	 * Constructor
	 * 
	 * @param filepath a full or partial path to read the file with the symptoms.
	 * 
	 */
	public ReadSymptomDataFromFile(String filepath) {

		this.filepath = filepath;
	}

	/**
	 * Method that read the symptoms from a file.
	 * 
	 * Implementation a <code>try-catch</code> to catch a possible IOException if
	 * the resources not correctly closed
	 *
	 * Implementation of the method toLowerCase() that convert the variable line to
	 * lower case.
	 * 
	 * @see String#toLowerCase()
	 * 
	 * @return an ArrayList that contain the symptoms which have been read from
	 *         file.
	 * 
	 */
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<>();

		if (filepath != null) {
			try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

				String line = reader.readLine();

				while (line != null) {

					String lineLower = line.toLowerCase();
					line = null;
					line = lineLower;
					result.add(line);
					line = reader.readLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
