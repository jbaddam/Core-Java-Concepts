package com.bootcamp.corejava.datatypes.arrays.lab4;


import java.util.Arrays;

/**
 * 
 * @author Jagan Reddy
 *
 */
public class PowerOfTwo {
	
	/*
	 * Returns an array of powers 2 for given range 
	 */
	public static int[] powerOfTwo(int n) {
		
		int[] arrayTwo = new int[n];
		int two = 2;
		for (int i = 0; i < n; i++) {
			two = two * 2;
			arrayTwo[i] = two;
		}

		return arrayTwo;
	}

	public static void main(String[] args) {
		
		System.out.println("Powers of 2 are \n" + Arrays.toString(powerOfTwo(10)));
	}

}
