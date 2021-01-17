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

	private static AnalyticsController analyticsControl = new AnalyticsController();

	public static void main(String[] args) {

		analyticsControl.requestSymptoms();

	}

}
