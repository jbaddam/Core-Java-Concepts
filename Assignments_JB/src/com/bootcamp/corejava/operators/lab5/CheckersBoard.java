package com.bootcamp.corejava.operators.lab5;

/**
 * @author Jagan Reddy
 * This class has a functionality to print the checker board pattern
 */
public class CheckersBoard {
	
	/**
	 * Method to print the checker board pattern
	 */
	public void printCheckersBoard() {

		for (int i = 0; i <= 8; i++) {
			
			System.out.print("* ");
		}
		
		System.out.println();
		System.out.print(" ");
		
		for (int i = 0; i <= 8; i++) {
			
			System.out.print("* ");
		}
		
		System.out.println();
	}

	public static void main(String args[]) {

		CheckersBoard cp = new CheckersBoard();
		
		int i = 0;
		while (i < 4) {
			cp.printCheckersBoard();
			i++;
		}
	}

}
