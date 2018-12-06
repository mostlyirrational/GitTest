package fxmlTest;

import java.util.ArrayList;

public enum Location {
	
	S0(0,"GO", 0),
	S1(1,"Statistics", 750),
	S2(2,"Chance", 0),
	S3(3,"A & P Design", 750),
	S4(4,"Pay for Books", 200),
	S5(5,"Interm. Prg.", 1000),
	S6(6,"Community Chest", 0),
	S7(7,"SoftEng I", 1000),
	S8(8,"Withdraw", 0 ), 
	S9(9,"SoftEng II", 1250),
	S10(10,"Disc Structures", 1250),
	S11(11,"Chance", 0),
	S12(12,"Visual Prg", 1250), 
	S13(13,"Software Doc", 1500),
	S14(14,"Community Chest", 0), 
	S15(15,"Server-Side Prg", 1500),
	S16(16,"Spring Break", 0),
	S17(17,"T&F of Networks", 1750), 
	S18(18,"Advanced Prg", 1750),
	S19(19,"Chance", 0),
	S20(20,"Ops Research", 2000),
	S21(21,"T & F of Op Sys", 2000), 
	S22(22,"Community Chest", 0), 
	S23(23,"Database Systems", 2000),	
	S24(24,"Failing, Go to WithDraw", 0),
	S25(25,"Human/Comp Interaction", 2250),
	S26(26,"Community Chest", 0),
	S27(27,"Data Mining", 2250),
	S28(28,"Chance", 0),
	S29(29,"Database AdminI", 2500),
	S30(30,"Buy new LAPTOP", 1000),
	S31(31,"Software Arch", 2500)
	;
	
	private int location;
	private String name;
	private int price;
	
	Location (int location, String name, int price){
		this.setLocation(location);
		this.setName(name);
		this.setPrice(price);
	}

	/**
	 * Array of Squares
	 */
	public static ArrayList<Squares> getSquaresArray(){
		ArrayList<Squares> squares = new ArrayList<>();
		for(Location loc : Location.values()) {
			squares.add(new Squares(loc.getLocation(), loc.getName(), loc.getPrice()));
		}
		return squares;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
}
