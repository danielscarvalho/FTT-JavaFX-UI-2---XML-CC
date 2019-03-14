package br.edu.cefsa.ftt.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	public void start(Stage primaryStage) {
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("MainUI.fxml"));

			Scene scene = new Scene(root, 800, 600);
			
			//CSS is AWESOME!!!
			//https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
			scene.getStylesheets().add(getClass()
					.getResource("UIMainScreen.css")
			            .toExternalForm());
			
			//TODO: Crie suas próprias teclas de atalho
			scene.setOnKeyPressed(e -> System.out.println(e.getCode()));
			
			primaryStage.setTitle("FTT Form");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		} //try
		
	}//start
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	} //main

}
