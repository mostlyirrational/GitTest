package fxmlTest;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class BoardController {
	
	private int numOfPlayers;
	
	ObservableList<String> numOfPlayersList = FXCollections.observableArrayList("2","3","4");
	
	public BoardController() { }

	
	//all the buttons
	@FXML
	private Button newGameButton, exitGameButton, argCreatePlayerNext, argCreatePlayerCancel;
	
	//pop up dialog windows
	@FXML
	private BorderPane argLoadWindow, argNumPlayerWindow;
	
	//number players chosen !!!NOT IMPLEMENTED
	@FXML
	private ComboBox<String> argNumOfPlayers;
	
	//all the names and prices
	@FXML
	private Label S0Label, S1Label, S1Price, S2Label, S3Label, S3Price, S4Label, S4Price, S5Label, S5Price, S6Label, S7Label, S7Price,
					S8Label, S9Label, S9Price, S10Label, S10Price, S11Label, S12Label, S12Price, S13Label, S13Price,  S14Label, S15Label, S15Price,
					S16Label, S17Label, S17Price, S18Label, S18Price, S19Label, S20Label, S20Price, S21Label, S21Price, S22Label, S22Price, S23Label, S23Price,
					S24Label, S25Label, S25Price, S26Label, S27Label, S27Price, S28Label, S29Label, S29Price, S30Label, S30Price, S31Label, S31Price;;
	
	//all the locations on board for holding the player pieces
	@FXML
	private FlowPane S0Piece, S1Piece, S2Piece, S3Piece, S4Piece, S5Piece, S6Piece, S7Piece, S8Piece, S8aPiece,
						S9Piece, S10Piece, S11Piece, S12Piece, S13Piece, S14Piece, S15Piece, S16Piece, 
						S17Piece, S18Piece, S19Piece, S20Piece, S21Piece, S22Piece, S23Piece, S24Piece,
						S25Piece, S26Piece, S27Piece, S28Piece, S29Piece, S30Piece, S31Piece;
					
	/**
	 * Change anything before showing 
	 */
	@FXML
	public  void initialize() {
		initBoard();
		//Show start game dialog
		argLoadWindow.setVisible(true);
		
		argNumOfPlayers.setValue("2");
		argNumOfPlayers.setItems(numOfPlayersList);
		

	}
	
	//change all the locations to reflect the names and prices from enum Location
	private void initBoard() {
		changeText(S0Label, Location.S0.getName());
		changeText(S1Label, Location.S1.getName());
		changePrice(S1Price, Location.S1.getPrice());
		changeText(S2Label, Location.S2.getName());
		changeText(S3Label, Location.S3.getName());
		changePrice(S3Price, Location.S3.getPrice());
		changeText(S4Label, Location.S4.getName());
		changePrice(S4Price, Location.S4.getPrice());
		changeText(S5Label, Location.S5.getName());
		changePrice(S5Price, Location.S5.getPrice());
		changeText(S6Label, Location.S6.getName());
		changeText(S7Label, Location.S7.getName());
		changePrice(S7Price, Location.S8.getPrice());
		changeText(S8Label, Location.S8.getName());
		changeText(S9Label, Location.S9.getName());
		changePrice(S9Price, Location.S9.getPrice());
		changeText(S10Label, Location.S10.getName());
		changePrice(S10Price, Location.S10.getPrice());
		changeText(S11Label, Location.S11.getName());
		changeText(S12Label, Location.S12.getName());
		changePrice(S12Price, Location.S12.getPrice());
		changeText(S13Label, Location.S13.getName());
		changePrice(S13Price, Location.S13.getPrice());
		changeText(S14Label, Location.S14.getName());
		changeText(S15Label, Location.S15.getName());
		changePrice(S15Price, Location.S15.getPrice());
		changeText(S16Label, Location.S16.getName());
		changeText(S17Label, Location.S17.getName());
		changePrice(S17Price, Location.S17.getPrice());
		changeText(S18Label, Location.S18.getName());
		changePrice(S18Price, Location.S18.getPrice());
		changeText(S19Label, Location.S19.getName());
		changeText(S20Label, Location.S20.getName());
		changePrice(S20Price, Location.S20.getPrice());
		changeText(S21Label, Location.S21.getName());
		changePrice(S21Price, Location.S21.getPrice());
		changeText(S22Label, Location.S22.getName());
		changeText(S23Label, Location.S23.getName());
		changePrice(S23Price, Location.S23.getPrice());
		changeText(S24Label, Location.S24.getName());
		changeText(S25Label, Location.S25.getName());
		changePrice(S25Price, Location.S25.getPrice());
		changeText(S26Label, Location.S26.getName());
		changeText(S27Label, Location.S27.getName());
		changePrice(S27Price, Location.S27.getPrice());
		changeText(S28Label, Location.S28.getName());
		changeText(S29Label, Location.S29.getName());
		changePrice(S29Price, Location.S29.getPrice());
		changeText(S30Label, Location.S30.getName());
		changePrice(S30Price, Location.S30.getPrice());
		changeText(S31Label, Location.S31.getName());
		changePrice(S31Price, Location.S31.getPrice());
	}
	
	private void changePrice(Label label, int i) {
		label.setText("$"+i);
	}
	private void changeText(Label label, String s) {
		label.setText(s);
	}
	
	//Exit Button
	@FXML
	protected void exitGame() {
		System.exit(0);
	}
	
	//show start game window
	@FXML
	protected void startGame() {
		argLoadWindow.setVisible(false);
		argNumPlayerWindow.setVisible(true);
	}
	
	//Show create player window
	@FXML
	protected void createPlayers() {
		argNumPlayerWindow.setVisible(false);
		setNumOfPlayers(Integer.parseInt(argNumOfPlayers.getValue()));
		new Game(this);
	}
	
	
	@FXML
	protected void closeCreatePlayer() {
		argNumPlayerWindow.setVisible(false);
		argLoadWindow.setVisible(true);
	}

	//all the getters for the flowPane to place pieces
	public FlowPane getS0Piece() {return S0Piece;}
	public FlowPane getS1Piece() {return S1Piece;}
	public FlowPane getS2Piece() {return S2Piece;}
	public FlowPane getS3Piece() {return S3Piece;}
	public FlowPane getS4Piece() {return S4Piece;}
	public FlowPane getS5Piece() {return S5Piece;}
	public FlowPane getS6Piece() {return S6Piece;}
	public FlowPane getS7Piece() {return S7Piece;}
	public FlowPane getS8Piece() {return S8Piece;}
	public FlowPane getS9Piece() {return S9Piece;}
	public FlowPane getS10Piece() {return S10Piece;}
	public FlowPane getS11Piece() {return S11Piece;}
	public FlowPane getS12Piece() {return S12Piece;}
	public FlowPane getS13Piece() {return S13Piece;}
	public FlowPane getS14Piece() {return S14Piece;}
	public FlowPane getS15Piece() {return S15Piece;}
	public FlowPane getS16Piece() {return S16Piece;}
	public FlowPane getS17Piece() {return S17Piece;}
	public FlowPane getS18Piece() {return S18Piece;}
	public FlowPane getS19Piece() {return S19Piece;}
	public FlowPane getS20Piece() {return S20Piece;}
	public FlowPane getS21Piece() {return S21Piece;}
	public FlowPane getS22Piece() {return S22Piece;}
	public FlowPane getS23Piece() {return S23Piece;}
	public FlowPane getS24Piece() {return S24Piece;}
	public FlowPane getS25Piece() {return S25Piece;}
	public FlowPane getS26Piece() {return S26Piece;}
	public FlowPane getS27Piece() {return S27Piece;}
	public FlowPane getS28Piece() {return S28Piece;}
	public FlowPane getS29Piece() {return S29Piece;}
	public FlowPane getS30Piece() {return S30Piece;}
	public FlowPane getS31Piece() {return S31Piece;}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}


}
