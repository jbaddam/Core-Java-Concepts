package com.bootcamp.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Jagan Reddy
 * 
 */
public class NumberOperation {
	
	/**
	 * Method will calculate and display the sum, average and product of
	 * the given numbers and also specifies the largest and smallest numbers.
	 */
	public void performCalculation(int number1, int number2, int number3) {

		int sum = number1 + number2 + number3;

		System.out.println("Sum of " + number1 + ", " + number2 + ", " + number3 + " is " + sum);

		double avg = (number1 + number2 + number3) / 2;

		System.out.println("Average of " + number1 + ", " + number2 + ", " + number3 + " is " + avg);

		int product = number1 * number2 * number3;

		System.out.println("Product of " + number1 + ", " + number2 + ", " + number3 + " is " + product);

		int max = number1;

		if (number2 > max) {
			max = number2;
		}

		if (number3 > max) {
			max = number3;
		}

		int min = number1;

		if (number2 < min) {
			min = number2;
		}

		if (number3 < min) {
			min = number3;
		}
		System.out.println(max + " is the largest number");
		System.out.println(min + " is the smallest number");
	}

	public static void main(String args[]) {

		NumberOperation operation = new NumberOperation();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		operation.performCalculation(num1, num2, num3);

		sc.close();

	}

}
