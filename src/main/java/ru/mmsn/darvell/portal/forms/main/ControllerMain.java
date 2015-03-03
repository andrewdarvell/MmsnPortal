package ru.mmsn.darvell.portal.forms.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


/**
 * Контроллер к главной форме
 */
public class ControllerMain{

	@FXML
	private Button loginButton;

	/**
	 * Метод кнопки для авторизации
	 */
	@FXML
	public void onClickMethod(){
		System.out.println("Button clicked");
	}


}
