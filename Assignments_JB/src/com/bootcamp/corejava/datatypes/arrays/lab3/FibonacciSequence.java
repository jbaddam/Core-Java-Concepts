package com.bootcamp.corejava.datatypes.arrays.lab3;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jagan Reddy
 * 
 */
public class FibonacciSequence {
	
	/*
	 * This method accepts user input
	 * based on that it returns array of the fibonacci series elements
	 */
	public static int[] fibonacciSereis() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int[] fibArray = new int[n];
		fibArray[0] = 0;
		fibArray[1] = 1;

		for (int i = 2; i < n; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
		
		sc.close();
		return fibArray;
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci Sereice for given number is \n" + Arrays.toString(fibonacciSereis()));

	}

}
