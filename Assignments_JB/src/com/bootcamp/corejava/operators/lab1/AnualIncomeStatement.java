package com.bootcamp.corejava.operators.lab1;


/**
 * @author Jagan Reddy
 * This class has a functionality print the Annual income Statement
 */
public class AnualIncomeStatement {
	
	/**
	 * Prints the Annual income Statement
	 */	
	static void annualIncomeStatement(){
		
		double principle;
		double investment=14000;
		
		principle=investment + 0.4*investment;
		
		System.out.println("Total amount after 15% gain in the first year : "+principle);
		
		principle=principle-1500;
		
		System.out.println("\nTotal amount after loss $1500 in Second year : "+principle);
		
		principle=principle+(principle*0.12);
		
		System.out.println("\nTotal amount after  12% increment in Third year : "+principle);
		
	}
	
	public static void main(String[] args) {
		
		annualIncomeStatement();
		
	}

}
