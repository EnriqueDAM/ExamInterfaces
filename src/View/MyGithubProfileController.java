package View;

import Controller.MainApp;

public class MyGithubProfileController {

	// Reference to the main application.
	private MainApp mainApp;

	public MyGithubProfileController() {
	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 *
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		try {
			mainApp.init();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		mainApp.start(null);
	}

}
