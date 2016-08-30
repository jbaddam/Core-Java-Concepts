package com.bootcamp.corejava.flowcontrols.lab1;

/**
 * @author Jagan Reddy Prints the Even Numbers from 50 to 80 using While Loop
 *
 */
public class WhileLoop {

	/*
	 * Prints the Even Numbers from 50 to 80 using For Loop
	 */
	static void printEvenNumbers() {
		int i = 50;
		while (i < 80) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {

		printEvenNumbers();
	}

}
