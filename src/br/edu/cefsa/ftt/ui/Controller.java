package br.edu.cefsa.ftt.ui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	

	@FXML //Annotation
	private TextArea textAreaComponent;

	@FXML
	private TextField textBoxComponent;

	public void deleteButton() {
		System.out.println("Deleted...");
	}
	
	public void saveButton() {
		System.out.println("Save...");
		textAreaComponent.appendText(new java.util.Date() + " Save...\n");
	}
	
	public void newButton() {
		System.out.println("New...");
	}
	
	@FXML
	public void searchButton() {
		System.out.print("Search for ");
		System.out.println(textBoxComponent.getText());
	}
	
	public void closeApp() {
		System.out.print("See you latter!!!!");
		Platform.exit();
	}
	
	public void aboutDialog() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		
		alert.setTitle("About: Sobre este programa...");
		alert.setHeaderText("FTT UI FX 2");
		alert.setContentText("Vai Corinthians!!\nÉ nóis na fita mano!!");
		
		alert.showAndWait();
	} //aboutDialog
}
