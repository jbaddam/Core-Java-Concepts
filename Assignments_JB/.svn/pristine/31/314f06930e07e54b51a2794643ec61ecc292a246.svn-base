package com.bootcamp.corejava.flowcontrols.lab2;


import java.util.Scanner;

/** 
 * @author Jagan Reddy Students Results
 */
public class StudentResult {

	/**
	 * Method return true if Student marks between 65 & 100 else it returns
	 * false
	 */
	static boolean hasPassed(int marks) {
		if (marks <= 100 && marks >= 65)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		System.out.println("Enter the Students Marks Secured ");
		Scanner sc = new Scanner(System.in);
		int marksSecured = sc.nextInt();
		sc.close();

		if (hasPassed(marksSecured))
			System.out.println("Passed Successfully!");
		else
			System.out.println("Failed! The range of the qualifying exam marks " + "is between 65 and 100");

	}

}
