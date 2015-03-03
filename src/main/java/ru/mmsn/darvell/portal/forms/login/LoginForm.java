package ru.mmsn.darvell.portal.forms.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Главный класс приложения. Он всё будет запускать
 * Воу воу воу
 */
public class LoginForm extends Application {



	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		String fxmlFile = "/fxml/login.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(new ControllerLogin());
		Parent root = (Parent) fxmlLoader.load(this.getClass().getResourceAsStream(fxmlFile));
		stage.setScene(new Scene(root));
		stage.show();
	}
}
