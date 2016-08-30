package com.bootcamp.corejava.datatypes.strings.lab4;

import java.util.Arrays;

/**
 * @author Jagan Reddy
 *
 */

public class MaxNumber {
	static String s = "324,457,112,259,323,222";
	static String[] parts = s.split(",");
	static int[] intParts;

	/**
	 * this method converts the string into integer array
	 */
	static void stringToInt() {
		System.out.println("Array After splitted String\n" + Arrays.toString(parts));
		intParts = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			intParts[i] = Integer.parseInt(parts[i]);
		}
	}

	
	/**
	 * @return
	 * This method returns array of the sum of the digits in the numbers in a array
	 */
	static int[] SumOfDigitHigherValues() {
		int[] digitSumOfNumber = new int[parts.length];
		for (int i = 0; i < intParts.length; i++) {
			int num = intParts[i];
			int sum = 0;
			while (num > 0) {
				sum = sum + num % 10;
				num = num / 10;
			}
			digitSumOfNumber[i] = sum;
		}
		
		int max = digitSumOfNumber[0];
		
		// finding the maximum
		for (int i = 0; i < digitSumOfNumber.length; i++) {
			if (digitSumOfNumber[i] > max) {
				max = digitSumOfNumber[i];
			}
		}
		
		int count = 0;
		
		// finding how many max numbers in the array
		for (int j = 0; j < digitSumOfNumber.length; j++) {
			if (digitSumOfNumber[j] == max) {
				count++;
			}
		}
		
		int j = 0;
		int[] indexsOfArray = new int[count];
		
		
		for (int k = 0; k < digitSumOfNumber.length; k++) {
			if (digitSumOfNumber[k] == max) {
				indexsOfArray[j] = k;
				j++;
			}
		}
		int z = 0;
		int[] resultArray = new int[indexsOfArray.length];
		for (int l = 0; l < intParts.length; l++) {
			if (digitSumOfNumber[l] == max) {
				resultArray[z] = intParts[l];
				z++;
			}
		}

		System.out.println("\nSum of Digits Array\n" + Arrays.toString(digitSumOfNumber));
		return resultArray;

	}

	public static void main(String[] args) {
		
		stringToInt();
		
		System.out.println("\nActual Higher values\n" + Arrays.toString(SumOfDigitHigherValues()));

	}
}
