package ru.mmsn.darvell.portal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Главный класс приложения. Он всё будет запускать
 * Воу воу воу
 */
public class MainApp extends Application {

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/main.fxml";
		FXMLLoader loader = new FXMLLoader();
		Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
		stage.setTitle("JavaFX and Maven");
		stage.setScene(new Scene(root));
		stage.show();
	}
}
