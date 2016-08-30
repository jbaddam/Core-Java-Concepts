package com.bootcamp.corejava.flowcontrols.lab9;


import java.util.Scanner;


/**
 * @author Jagan Reddy
 * This class has a functionality to decide triangle is a right angled or not
 */
public class RightAngleTraingle {
	
	/*
	 * @param side1,side2,side3
	 * This method will take three sides as input and 
	 * checks whether a right angled triangle can be formed or not.
	 */
	public static void checkRightAngleTriangle(int s1, int s2, int s3) {
		
		if (s1 != 0 && s2 != 0 && s3 != 0) {
		
			if ((s1 * s1) == ((s2 * s2) + (s3 * s3))) {
				System.out.println(" Right Angled Triangle ");
			} 
			else if ((s2 * s2) == ((s1 * s1) + (s3 * s3))) {
				System.out.println("A Right Angled Triangle ");
			} 
			else if ((s3 * s3) == ((s1 * s1) + (s2 * s2))) {
				System.out.println("A Right Angled Triangle ");
			} 
			else
				System.out.println("Oops !  given sides Dosent form Right angle traingle");
		} 
		else
			System.out.println("Sides Should not be zero.");
	}

	public static void main(String[] args) {
		
		System.out.println("Enter 3 sides of triangle: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side 1  :");
		int side1 = sc.nextInt();
		System.out.print("Enter side 2  :");
		int side2 = sc.nextInt();
		System.out.print("Enter side 3  :");
		int side3 = sc.nextInt();
		
		checkRightAngleTriangle(side1, side2, side3);
		
		sc.close();
	}
}
