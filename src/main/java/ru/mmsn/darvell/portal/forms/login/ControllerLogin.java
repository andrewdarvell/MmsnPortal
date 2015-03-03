package ru.mmsn.darvell.portal.forms.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


/**
 * Контроллер к главной форме
 */
public class ControllerLogin {

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
