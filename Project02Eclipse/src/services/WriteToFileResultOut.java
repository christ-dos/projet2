package services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Class that write to a file.
 * 
 * And that implement IWriteToFile Interface.
 * 
 * @see IWriteToFile
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 * 
 *
 */
public class WriteToFileResultOut implements IWriteToFile {

	/**
	 * A String that contain full or partial path.
	 * 
	 */
	private String filepath;

	/**
	 * Constructor of WriteToFileResultOut.
	 * 
	 * @param filepath A full or partial path to a file to write the results.
	 * 
	 */
	public WriteToFileResultOut(String filepath) {

		this.filepath = filepath;
	}

	/**
	 * Method that write to a file .
	 * 
	 * Implementation a <code>try-catch</code> to catch a possible IOException if
	 * the resources not correctly closed.
	 * 
	 * @param symptomsMap A TreeMap that contain the symptoms and occurrences of
	 *                    them.
	 * 
	 * @return a Map with the results of symptoms.
	 * 
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
