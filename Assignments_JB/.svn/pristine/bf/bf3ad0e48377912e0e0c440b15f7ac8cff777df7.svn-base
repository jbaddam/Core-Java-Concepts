package com.bootcamp.corejava.operators.lab5;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 *
 */
public class OddEvenChecker {
	
	/**
	 * @param number
	 * this method will check and print the message whether the given number is odd or even
	 */
	public void checkOddEven(int number) {

		if (number % 2 == 0)
			System.out.println("The given Number " + number + " is Even.");
		else
			System.out.println("The given Number " + number + " is Odd.");
	}

	public static void main(String args[]) {

		OddEvenChecker numberType = new OddEvenChecker();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number :");

		int number = sc.nextInt();
		
		numberType.checkOddEven(number);
		
		sc.close();
	}
}
