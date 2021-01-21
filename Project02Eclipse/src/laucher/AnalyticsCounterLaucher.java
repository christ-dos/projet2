package laucher;

import Controller.AnalyticsController;

/**
 * Class that launch the application
 * 
 * @author Christine Dos Santos Duarte
 * 
 * @version 0.1.0
 *
 */
public class AnalyticsCounterLaucher {

	/**
	 * analyticsControl is an instance of AnalyticsController.
	 * 
	 * that permit execute the requests to the AnalyticsController.
	 * 
	 * @see AnalyticsController
	 * 
	 */
	private static AnalyticsController analyticsControl = new AnalyticsController();

	/**
	 * first method executed by the application
	 * 
	 * @param args an Array of String that can contain the arguments of the method.
	 * 
	 */
	public static void main(String[] args) {

		analyticsControl.requestSymptoms();

	}

}
