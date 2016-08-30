package com.bootcamp.corejava.flowcontrols.lab7;

import java.util.Scanner;

/**
 * @author Jagan Reddy
 */
public class LargestNumber {
	
	static int largeNumber = 0;

	/**
	 * @param n
	 * @return largeNumber
	 * This method will take integers as input and returns the largest number
	 * among the given input.
	 */
	public static int findLargest(int n) {

		if (n > largeNumber)
			largeNumber = n;
		return largeNumber;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter 10 numbers to find the largest number among them: ");
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int number = 0;
		int largest = 0;
		
		while (counter < 10) {
			
			number = scanner.nextInt();
			counter++;
			largest = findLargest(number);
			
			if (counter == 10) {
				
				scanner.close();
				System.out.println("10 Numbers Entered.");
			}
		}
		
		System.out.println("\nThe Largest number is: " + largest);
		System.out.println("The integer most recetly given as input is: " + number);
	}
}

