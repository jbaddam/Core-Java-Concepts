package com.bootcamp.corejava.flowcontrols.lab10;

import java.util.Scanner;

/**
 * @author Jagan Reddy This class has a functionalities to Encript and Decript
 *         The given 4 digit number
 */
public class DataEncryptionDecription {

	static String encript(String valueToEncript) {

		int[] encriptArray = new int[valueToEncript.length()];

		/*
		 * Replacing each digit with the result of adding 7 to the digit and
		 * getting the remainder after dividing the new value by 10 using for
		 * loop.
		 */
		for (int i = 0; i < encriptArray.length; i++) {
			int x = Character.getNumericValue(valueToEncript.charAt(i));
			encriptArray[i] = (7 + x) % 10;
		}

		swap(encriptArray);// calling swap method

		StringBuilder encriptValue = new StringBuilder("");
		for (int i : encriptArray) {
			encriptValue.append(i);
		}
		String encriptedValue = encriptValue.toString();
		return encriptedValue;
	}

	static String decript(String valueToDecript) {

		int[] decriptArray = new int[valueToDecript.length()];

		for (int i = 0; i < valueToDecript.length(); i++) {
			decriptArray[i] = Character.getNumericValue(valueToDecript.charAt(i));
		}

		swap(decriptArray);// calling swap method

		/*
		 * Replacing each digit with the result of adding 7 to the digit and
		 * getting the remainder after dividing the new value by 10 using for
		 * loop.
		 */
		int[] array = new int[decriptArray.length];
		for (int i = 0; i < decriptArray.length; i++) {
			if (decriptArray[i] < 7)
				array[i] = (decriptArray[i] + 10 - 7);
			else
				array[i] = (decriptArray[i] - 7);

		}

		StringBuilder builder = new StringBuilder();
		for (int i : array) {
			builder.append(i);
		}
		String dicriptedValue = builder.toString();

		return dicriptedValue;
	}

	/*
	 * swap the first digit with the third, and swap the second digit with the
	 * fourth
	 */
	static void swap(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[i + 2];
			arr[i + 2] = tmp;
		}

	}

	public static void main(String[] args) {
		System.out.print("Enter The Four Digit Number to Encript(4 digits only) : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String estr = encript(input);
		System.out.print("\nValue after Encript " + estr);

		// passing encrypted value to decript method
		String dstr = decript(estr);
		System.out.print("\n\nValue after Decript(Original Value) " + dstr);
		sc.close();
	}

}
