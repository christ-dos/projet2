package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * Constructor
	 * 
	 * @param filepath the path that contain the file.
	 */
	public ReadSymptomDataFromFile(String filepath) {

		this.filepath = filepath;
	}

	/**
	 * Method that read the symptoms to a file.
	 * 
	 * @param filepath the path that contain the file.
	 * 
	 * @throws IOException
	 */
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

				String line = reader.readLine();

				while (line != null) {
					/** toLowerCase() method that convert the variable line to lower case. */
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
