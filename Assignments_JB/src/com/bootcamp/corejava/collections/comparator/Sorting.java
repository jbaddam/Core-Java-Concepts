package com.bootcamp.corejava.collections.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Jagan Reddy
 * Sorting the Random numbers using comparators
 */
public class Sorting {
	
	public static void main(String[] args) {
	    int listSize = 30;
	    int magnitude = 500;
	    Random rand = new Random(12345);
	    
		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
	    for (int i=0; i < listSize; i++) {
	      numbers.add(rand.nextInt() % magnitude);
		}
	    
		Collections.sort(numbers);
	    
		for (Integer num : numbers) {
	      System.out.print(num + " ");
		}
	    System.out.println();
	    
	    //Sorting the random numbers in descending order using user defined sorting logic  
	    Collections.sort(numbers, new BackwardOrdering());
		
		for (Integer num1 : numbers) {
		System.out.print(num1 + " ");
		}
		System.out.println();
        
		//Sorting the random numbers , -ve numbers in descending and +ve numbers in ascending order using user defined sorting logic 
		Collections.sort(numbers, new AlternatingOrdering());
		for (Integer num2 : numbers) {
		System.out.print(num2 + " ");
		}
	  }
	
	

}



