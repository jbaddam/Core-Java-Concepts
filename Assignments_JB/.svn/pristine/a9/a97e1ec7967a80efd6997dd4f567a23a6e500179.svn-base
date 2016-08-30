package com.bootcamp.corejava.flowcontrols.lab8;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 *
 */
public class Sqaure {

	/**
	 * @param side
	 * method will take the side of the square as input and prints
	 * square with the side specified by using asterisk.
	 */
	public static void printSquare(int side) {

		if (side >= 1 && side <= 20) {

			for (int i = 1; i < side+1; i++) {
				if (i < side )
					System.out.print("* ");
				else
					System.out.print("*");
			}

			for (int j = 1; j < side - 1; j++) {
				System.out.print("\n*");

				for (int i = 0; i < side - 1; i++) {
					System.out.print(" ");
				}

				for (int k = 1; k < side; k++) {
					if (k == side - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

			System.out.println();

			for (int k = 0; k < side; k++) {
				if (k < side - 1)
					System.out.print("* ");
				else
					System.out.print("*");
			}
		} else
			System.out.println("Side legnth must be in between 1 and 20.");
	}

	public static void main(String[] args) {

		System.out.print("Enter the side of a square: ");
		Scanner scanner = new Scanner(System.in);

		int side = scanner.nextInt();

		printSquare(side);

		scanner.close();
	}

}
