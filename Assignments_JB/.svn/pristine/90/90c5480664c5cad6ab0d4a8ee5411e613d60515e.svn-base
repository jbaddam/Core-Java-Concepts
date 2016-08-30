package com.bootcamp.corejava.operators.lab5;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 * This class has functionality to compares given two numbers
 */
public class NumberComarator {
	
	/**
	 * Method compares given two numbers and prints the result.
	 */
	public void compareNumbers(int number1,int number2) {

		if (number1 == number2)
			System.out.println("Numbers are equal");

		else if (number1 > number2)
			System.out.println(number1 + " is larger");

		else
			System.out.println(number2 + " is larger");
	}

	public static void main(String args[]) {

		NumberComarator compare = new NumberComarator();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers:");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		compare.compareNumbers(num1,num2);
		
		sc.close();
	}

}
