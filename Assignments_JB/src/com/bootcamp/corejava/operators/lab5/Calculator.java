package com.bootcamp.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Jagan Reddy
 * Calculator class to perform and print different arithmetic operations
 */
public class Calculator {
	
	/**
	 * @param firstNumber
	 * @param secondNumber
	 * This method will perform and print different arithmetic operations
	 */
	public void arithmeticOperation(int firstNumber, int secondNumber) {

		System.out.println("Additn of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber + secondNumber));
		System.out.println("Subtaction of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber - secondNumber));
		System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber * secondNumber));
		System.out.println("Division of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber / secondNumber));
		System.out.println("Mod of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber % secondNumber));

	}

	public static void main(String args[]) {

		Calculator calculator = new Calculator();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two numbers perform arithmetic operations:");

		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();

		calculator.arithmeticOperation(firstNumber, secondNumber);
		sc.close();
	}

}
