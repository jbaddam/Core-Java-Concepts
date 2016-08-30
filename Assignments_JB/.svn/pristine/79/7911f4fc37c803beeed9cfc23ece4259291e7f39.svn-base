package com.bootcamp.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Jagan Reddy
 * this class has a functionality check if the first number is 
 * multiple of second number
 */
public class MultipleVerifier {
	
	/**
	 * Method to check if the first number is multiple
	 * of second number or not.
	 */
	public void checkMultiples(int n1, int n2) {

		if (n2 % n1 == 0) {

			System.out.println("nteger " + n1 + " is a multiple of " + n2);
		}

		else {

			System.out.println("Integer " + n1 + " is not a multiple of " + n2);
		}
	}

	public static void main(String args[]) {

		MultipleVerifier vm = new MultipleVerifier();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the integers");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		vm.checkMultiples(num1, num2);

		sc.close();
	}

}
