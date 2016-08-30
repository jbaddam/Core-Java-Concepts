package com.bootcamp.corejava.operators.lab5;


/**
 * @author Jagan Reddy
 *
 */
public class PowerCalculator {
	
	/**
	 * This method calculates the square and cube of a given number and displays
	 * the result.
	 */
	public void powerCalculator() {
		System.out.println("Power1 \t    Power2 \t    Power3");

		for (int i = 0; i <= 10; i++) {

			System.out.println(i + "\t\t" + (int) Math.pow(i, 2) + "\t\t" + (int) Math.pow(i, 3));
		}
	}

	public static void main(String args[]) {

		PowerCalculator pc = new PowerCalculator();

		pc.powerCalculator();
	}

}
