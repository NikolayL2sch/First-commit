package application; 

import java.net.URL; 
import java.util.ResourceBundle; 

import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text; 

public class Mycontroller implements Initializable{ 
	@FXML 
	private Text txt1; 

	@FXML 
	private TextField txt2; 

	@FXML 
	private Text txt3; 
	
	@FXML 
	private PasswordField txt4; 
	
	@FXML 
	private TextField txt5; 
	
	@FXML 
	private TextField txt6; 
	
	String login = "mylifesucks";
	String password = "mdanuiailoh";
	
	@FXML 
	private Button button1; 
	
	@FXML 
	private Button button2; 
	
	public void initialize(URL location, ResourceBundle resources) { 

		// TODO (don't really need to do anything here). 

	} 
	// When user click on button1 
	// this method will be called. 
	public void action1(ActionEvent event) {
		if (login.equals(txt2.getText())) {
			txt5.setText("Login is right!");
		}
	}
	public void action2(ActionEvent event) {
		if (password.equals(txt4.getText())) {
			txt5.setText("Password is right!");
		}
	}
	
}