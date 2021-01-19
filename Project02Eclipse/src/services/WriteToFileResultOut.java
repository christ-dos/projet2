package services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Class that write to a file. And that implement IWriteToFile Interface.
 * 
 * @author Christine Dos Santos Duarte
 * 
 */
public class WriteToFileResultOut implements IWriteToFile {

	private String filepath;

	/**
	 * Constructor of WriteToFileResultOut
	 * 
	 * @param filepath a full or partial path to the file to write the results
	 * 
	 */
	public WriteToFileResultOut(String filepath) {

		this.filepath = filepath;
	}

	/**
	 * method that write to a file .
	 * 
	 * @param symptomsMap a TreeMap that contain the symptoms and occurrences of
	 *                    them.
	 * @param filepath    a full or partial path to the file to write the results
	 * 
	 * @throws IOException.
	 *
	 * @return a Map with the results of symptoms.
	 */

	@Override
	public TreeMap<String, Integer> copyToFile(TreeMap<String, Integer> symptomsMap) {

		if (filepath != null) {
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
		}
		return symptomsMap;

	}

}
