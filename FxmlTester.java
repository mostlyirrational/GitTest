package fxmlTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlTester extends Application{
	
	public static BoardController boardController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Load FXML File
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Argonautopoly.fxml"));
		//Build FXML and load into root
		Parent root = (Parent)loader.load();
		
		//set scene and show (ready to go!!)
		Scene scene = new Scene(root);
		primaryStage.setTitle("test");
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.show();
		
		//load the controller so was can access methods
		//will need to pass this to Game(Controller boardController) ??type
		 boardController = loader.getController();
		
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	


}
