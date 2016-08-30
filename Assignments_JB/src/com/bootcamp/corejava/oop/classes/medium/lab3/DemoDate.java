package com.bootcamp.corejava.oop.classes.medium.lab3;


/**
 * @author Jagan Reddy
 *
 */
public class DemoDate {

	public static void main(String[] args) {
		MyDate date = new MyDate(9,27,1990);
		System.out.print("Printing date after setting through Constructor : "+date.displayDate());
		
		date.setDay(5);
		date.setMonth(6);
		date.setYear(1986);
	    System.out.print("\nPrinting date after setting through setters : "+date.displayDate());
		
	}
	
}
