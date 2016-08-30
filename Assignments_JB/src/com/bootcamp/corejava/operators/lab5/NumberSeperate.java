package com.bootcamp.corejava.operators.lab5;

import java.util.Scanner;

/**
 * @author Jagan Reddy
 * This class has a functionality to separate the each digit
 *  with space in a given number
 */
public class NumberSeperate {
	
	/**
	 * This method takes the given number and prints the individual digits with spaces.
	 */
	public void serparateNumber(int number) {

		int length = String.valueOf(number).length();
		int num = 1;
		
		for(int i=1;i<length;i++)
			 num = num * 10;

		for(int i=1; i<=length; i++){
			
			System.out.print(number/num + " ");
			number = number % num;
			num = num / 10;
		}
	}

	public static void main(String args[]) {

		NumberSeperate ns = new NumberSeperate();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number");

		int number = sc.nextInt();
		
		ns.serparateNumber(number);
		
		sc.close();
	}

}
