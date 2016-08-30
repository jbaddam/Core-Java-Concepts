package com.bootcamp.corejava.datatypes.lab1;


/**
 * @author Jagan Reddy
 */
public class DataTypes {
	
	/**
	 * This method will add and prints the sum of four numbers.
	 */
	public static void add() {
		
		double sum = 10 + 40 + 142.5 + 333.62;
		System.out.println("Sum of 4 Numbers: " + sum);
	}

	/**
	 * This method will perform arithmetic operations on two numbers.
	 */
	public static void arithmeticOperations() {
		
		int a = 45, b = -21;
		
		System.out.println("\nArithmetic operations result");
		System.out.println("Sum of two numbers  : " + (a + b));
		System.out.println("Difference of two numbers  : " + (a - b));
		System.out.println("Product of two numbers  : " + (a * b));
		System.out.println("Quotient of two numbers  : " + (a / b));
		System.out.println("Remainder of two numbers  : " + (a % b));
	}

	/**
	 * This method will initialize and prints a string.
	 */
	public static void initializeString() {
		
		String str = "Hello how are you";
		
		System.out.print("\nString is: ");
		System.out.println(str);
	}

	/**
	 * This method will initialize and prints a character.
	 */
	public static void initializeChar() {
		
		char c = 'H';
		
		System.out.print("\nChar is: "+c);
		
	}

	/**
	 * This method will perform up casting by converting an integer to long type.
	 */
	public static void upCasting() {
		
		int integer = 123;
		long number = integer;
		
		System.out.print("\nAfter Upcasting : "+number);
	
	}

	/**
	 * This method will perform down casting by converting long type to integer.
	 */
	public static void downcasting() {
		
		long number = 123456789;
		int integer = (int) number;
		
		System.out.print("\nAfter Downcasting : "+integer);
		
	}

	/**
	 * This method will initialize and print an array of 1s.
	 */
	public static void intArray() {
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		System.out.println("Integer array: ");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}

	/**
	 * This method will initialize and print an array of alphabets.
	 */
	public static void charArray() {
		
		char[] array = new char[26];
		int i = 0;
		char c = 'a';
		
		while (c <= 'z') {
			while (i < 26) {
				array[i] = c;
				c++;
				i++;
			}
		}
		
		System.out.print("\n\nCharacter array : ");
		System.out.println("[");
		
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		
		System.out.println("]");
	}

	/**
	 * This method will initialize and print a 2D array.
	 */
	public static void array2D() {
		
		int[][] table = new int[7][5];
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = i;
			}
		}
		
		System.out.println("\n\n 2D table result: ");
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(table[i][j] + " ");
			}
			
			System.out.println();
		}
	}

	/**
	 * This method will performing casting between string and integer.
	 */
	public static void typeCasting() {
		
		String number = "10";
		int num = Integer.parseInt(number);
		
		System.out.print("\n\nType casting result: ");
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		add();
		arithmeticOperations();
		initializeString();
		initializeChar();
		upCasting();
		downcasting();
		intArray();
		charArray();
		array2D();
		typeCasting();
	}

}

