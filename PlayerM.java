package fxmlTest;
 /*
 * Used to create player objects
 * Each object stores the inventory of the player
 * Inventory includes cards (chance and community chest), properties, money, and location on board
 * 
 *  ***NO IDEA WHAT IM DOING ANYMORE SOMEONE HELP***
 * 
 * @author Michael Kuklish
 * @version 0.1
 * 
 * CEN3031 Software Engineering Project
 * File Name: Player.java
 */

public class PlayerM {
	private int id;
	private int money;
	//as of this moment they are throwing warnings because I can't reference the proper classes
	//private Card card; 				//suppress warning
	//private Property property;		//suppress warning
	//private Location location;		//suppress warning
	
	//default constructor
	public PlayerM() {
	}
	
	public PlayerM(int i) {
		this.setId(i);
		this.setMoney(1500);
	}
	
	//NEEDS LOTS MORE I JUST NEED TO REMEMBER WHERE TO START
	//FINALLY STARTED THIS A 0300 ON WEDNESDAY
	
	/**
	 * Method that moves the player object
	 * 
	 */
	public void move() {
		//TO DO
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
