package com.bootcamp.corejava.datatypes.strings.lab2;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 */
public class DateExtraction {

	/**
	 * @param str
	 *            This method will split the date into three different strings
	 *            and displays them.
	 */
	public static void extractDate(String str) {

		String[] dt = str.split("/");
		String month = dt[0];
		String date = dt[1];
		String year = dt[2];

		System.out.println("Date: " + date + "\nMonth: " + month + "\nYear: " + year);
	}

	public static void main(String[] args) {

		System.out.println("Enter your DOB in MM/DD/YYYY format: ");

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		extractDate(input);

		sc.close();
	}
}
