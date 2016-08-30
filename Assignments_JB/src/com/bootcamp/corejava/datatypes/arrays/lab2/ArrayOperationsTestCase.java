package com.bootcamp.corejava.datatypes.arrays.lab2;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bootcamp.corejava.datatypes.arrays.lab1.ArrayOperations;

/**
 * @author Jagan Reddy
 * Junit Test cases for ArrayOperation class
 */
public class ArrayOperationsTestCase {

	 
	int[] inputArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
	
	

	@Test
	public void testmaxElementInArray() {
		
		int expected = ArrayOperations.maxElementInArray(inputArray);
		int actual = 36;
		assertEquals("Valid input and output ",expected, actual);
		
		int actual1 = 10;
		assertNotEquals("Valid input and output ",expected, actual1);
		
	}
	
	@Test
	public void testfindOddNumbers() {
		
		int[] expected = ArrayOperations.findOddNumbers(inputArray);
		int[] actual = {9,21,5,3};
		assertArrayEquals("Valid input and output ",expected, actual);
				
	}
	
	@Test
	public void testevenNumberIncrement() {
		
		int[] expected = ArrayOperations.evenNumberIncrement(inputArray);
		int[] actual = { 9, 10, 12, 14, 20, 22, 21, 5, 38, 3 };
		assertArrayEquals("Valid input and output ",expected, actual);
				
	}
	
	@Test
	public void testdivisibleByThree() {
		
		int[] expected = ArrayOperations.divisibleByThree(inputArray);
		int[] actual = { 9, 12, 18, 21, 36, 3 };
		assertArrayEquals("Valid input and output ",expected, actual);
				
	}
	
	@Test
	public void testfindAvg() {
		
		int expected = ArrayOperations.findAvg(inputArray);
		int actual = 14;
		assertEquals("Valid input and output ",expected, actual);
		
		int actual1 = 10;
		assertNotEquals("Valid input and output ",expected, actual1);
				
	}
	
	@Test
	public void testminElementInArray() {
		
		int expected = ArrayOperations.minElementInArray(inputArray);
		int actual = 3;
		assertEquals("Valid input and output ",expected, actual);
		
		int actual1 = 10;
		assertNotEquals("Valid input and output ",expected, actual1);
		
	}
	
	@Test
	public void testlessThanAvg() {
		
		int[] expected = ArrayOperations.lessThanAvg(inputArray);
		int[] actual = { 9, 8, 10, 12, 5, 3 };
		assertArrayEquals("Valid input and output ",expected, actual);
				
	}

}
