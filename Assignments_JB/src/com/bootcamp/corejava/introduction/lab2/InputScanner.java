package com.bootcamp.corejava.introduction.lab2;


import java.util.Scanner;

/** 
 * @author Jagan Reddy
 * In this class Scanner class implementation is showed
 */
public class InputScanner {
	
	/*
	 * This method accepts first name, last name and age from console
	 * and print them as output
	 */
	static void scannerImplementation() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String fname = scanner.nextLine();
		
		System.out.println("Enter Last Name");
		String lname = scanner.nextLine();
		
		System.out.println("Enter Your Age");
		int age = scanner.nextInt();
		
		System.out.println("Student Name : " + fname + "  " + lname + "\nStudents age: " + age);
		scanner.close();
	}

	public static void main(String[] args) {

		scannerImplementation();

	}

}
