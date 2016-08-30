package com.bootcamp.corejava.datatypes.arrays.lab1;


import java.util.Arrays;

/** 
 * @author Jagan Reddy
 * Array Operations
 */
public class ArrayOperations {
	
	 
    
	/**
	 * This method return the max element from the numbersArray
	 */
	public static int maxElementInArray(int[] numbersArray) {
		int max = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] > max) {
				max = numbersArray[i];
			}
		}
		return max;
	}

	
	/**
	 * This method return array of odd numbers in the  numbersArray
	 */
	public static int[] findOddNumbers(int[] numbersArray) {
		int count = 0;
		int length = 0;

		for (int i = 0; i <= numbersArray.length - 1; i++) {
			if (numbersArray[i] % 2 != 0) {
				count++;
			}
		}
		int[] resultArray = new int[count];
		for (int j = 0; j <= numbersArray.length - 1; j++) {
			if (numbersArray[j] % 2 != 0) {
				resultArray[length] = numbersArray[j];
				length++;
			}
		}

		return resultArray;

	}

	/**
	 * This method return array after incrementing the even numbers
	 *   in the  numbersArray by 2
	 */
	public static int[] evenNumberIncrement(int[] numbersArray) {
		int[] resultArray = new int[numbersArray.length];
		for (int i = 0; i <= numbersArray.length - 1; i++) {
			if (numbersArray[i] % 2 == 0) {
				numbersArray[i] += 2;
			}
			resultArray[i] = numbersArray[i];

		}
		return resultArray;
	}

	/**
	 * This method return array of numbers divisible by 3 in the  numbersArray
	 */
	public static int[] divisibleByThree(int[] numbersArray) {
		int count = 0;
		int j = 0;

		for (int i = 0; i <= numbersArray.length - 1; i++) {
			if (numbersArray[i] % 3 == 0) {
				count++;
			}
		}

		int[] resultArray = new int[count];

		for (int k = 0; k <= numbersArray.length - 1; k++) {
			if (numbersArray[k] % 3 == 0) {
				resultArray[j] = numbersArray[k];
				j++;
			}
		}
		return resultArray;
	}

	/**
	 * This method return average of elements in numbersArrays 
	 */
	public static int findAvg(int[] numbersArray) {
		int sum = 0;
		for (int i = 0; i <= numbersArray.length - 1; i++) {
			sum += numbersArray[i];
		}
		int avg = sum / numbersArray.length;
		return avg;

	}

	/**
	 * This method return Minimum element in numbersArrays 
	 */
	public static int minElementInArray(int[] numbersArray) {
		int min = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < min) {
				min = numbersArray[i];
			}
		}
		return min;

	}

	/**
	 * This method return array of elements less than the Average in numbersArrays 
	 */
	public static int[] lessThanAvg(int[] numbersArray) {
		
		int count=0;
		
		
		for (int i = 0; i <= numbersArray.length - 1; i++) {
			
			if (numbersArray[i] < findAvg(numbersArray)) {
				count++;
			}
		}
		
		int[] lessThanAvg=new int[count];
		int j=0;
		int avg = findAvg(numbersArray);
		
		for (int i = 0; i <= numbersArray.length - 1; i++) {
			
			//checking whether elements are less than the avg element
			if (numbersArray[i] < avg) {
				lessThanAvg[j] = numbersArray[i];
				j++;
			}
		}
		return lessThanAvg;
	}

	public static void main(String[] args) {
		int[] inputArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };		
		System.out.println("Odd numbers are \n" + Arrays.toString(findOddNumbers(inputArray)));		
		System.out.println("\nAvarage of a given array is :" + findAvg(inputArray));
		System.out.println("\nMinimum Element in a given array is :" + minElementInArray(inputArray));
		System.out.println("\nMaximum Element in a given array is :" + maxElementInArray(inputArray));
		System.out.println("\nLess than the Avg are " +  Arrays.toString(lessThanAvg(inputArray)));
		System.out.println("\nArray after Even numbers incremented by 2 \n" + Arrays.toString(evenNumberIncrement(inputArray)));
		System.out.println("\nNumbers divisible by 3 are\n" + Arrays.toString(divisibleByThree(inputArray)));
	}

}
