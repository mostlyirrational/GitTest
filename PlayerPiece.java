package fxmlTest;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class PlayerPiece extends Pane{

	public PlayerPiece(int i) {
		
		setMinSize(20, 20);
		setPrefSize(20, 20);
		setMaxSize(20, 20);
		setStyle("-fx-border-color:#000;-fx-border-width:2px;-fx-background-color:#0F0;");
		//add margin 2px
		//center text and make bold
		//add color
		String s = ""+i;
		Label label = new Label(s);
		getChildren().add(label);
	}
}
