package ru.mmsn.darvell.portal.forms.main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by darvell on 03.03.15.
 */
public class ControllerMain{

	@FXML
	private Button loginButton;

	@FXML
	public void onClickMethod(){
		System.out.println("Button clicked");
	}


}
