package fxmlTest;

import java.util.ArrayList;

public class Game {
	
	private BoardController boardController;
	private ArrayList<Squares> squares = Location.getSquaresArray();
	private PlayerM[] players;

	public Game() {
	}
	
	public Game(BoardController boardController) {	
		//set boardController
		this.setBoardController(boardController);
		
		//STARTTGAME
		startGame();
	}
	
	//MAIN GAME LOOP
	public void startGame() {
		
		createPlayers();
		putPlayerPiecesOnStart();
		
		
	}
 
	public void createPlayers() {
		players = new PlayerM[boardController.getNumOfPlayers()];
		for (int i = 0; i < boardController.getNumOfPlayers(); i++) {
			players[i] = new PlayerM(i+1);
		}
	}

	private void putPlayerPiecesOnStart() {
		//loop through player array and put a piece on start
		for(PlayerM player : players) {
			boardController.getS0Piece().getChildren().add(new PlayerPiece(player.getId()));
			//TESTING
			System.out.println("Player "+player.getId()+" has $"+player.getMoney()+" in Bank.");
		}
	}

	public PlayerM[] getPlayers() {
		return players;
	}

	public void setPlayers(PlayerM[] players) {
		this.players = players;
	}

	public BoardController getBoardController() {
		return boardController;
	}

	public void setBoardController(BoardController boardController) {
		this.boardController = boardController;
	}

	public ArrayList<Squares> getSquares() {
		return squares;
	}

	public void setSquares(ArrayList<Squares> squares) {
		this.squares = squares;
	}
	
	
	
	

	
	
	
	
	
	
	
}
