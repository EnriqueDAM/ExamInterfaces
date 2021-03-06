package Controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Enrique
 *
 */
public class MainApp extends Application{

	private Stage primaryStage;
	private BorderPane rootLayout;

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("GitHubProfile");

		// Set the application icon.
		this.primaryStage.getIcons().add(
				new Image("file:res/img/github_white.png"));

		initGithubProfile();

		showGitHubProfile();
	}

	private void initGithubProfile() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class
					.getResource("../View/MyRootLayout.fxml"));
			rootLayout = (BorderPane)loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void showGitHubProfile() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class
					.getResource("../View/MyGithubProfile.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();
			rootLayout.setCenter(personOverview);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}



}
