package ru.mmsn.darvell.portal.forms.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.mmsn.darvell.portal.forms.main.ControllerMain;

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
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(new ControllerMain());
		Parent root = (Parent) fxmlLoader.load(this.getClass().getResourceAsStream(fxmlFile));
		stage.setScene(new Scene(root));
		stage.show();
	}
}
