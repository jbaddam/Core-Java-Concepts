package com.bootcamp.corejava.operators.lab5;

import java.util.Scanner;


/**
 * @author Jagan Reddy
 * this class has a functionality to calculate and print the Circle Properties
 */
public class Circle {

	/**
	 * @param radius
	 * this method will calculate and print the Circle Properties
	 */
	public void circleProperties(int radius) {

		System.out.printf("Diameter of  Circle is = %d \n", +(2 * radius));
		System.out.printf("Circumference of Circle is = %f \n", +(2 * Math.PI * radius));
		System.out.printf("Area of Circle is = %f \n", +(Math.PI * radius * radius));

	}

	public static void main(String args[]) {

		Circle c = new Circle();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius  of Circle :");

		int radius = sc.nextInt();

		c.circleProperties(radius);

		sc.close();
	}

}
