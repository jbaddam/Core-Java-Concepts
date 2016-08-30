package com.bootcamp.corejava.operators.lab4;


import java.util.Scanner;

/**
 * @author Jagan Reddy 
 * This class has functionalities to Converts the temperature from celsius to fahrenheit 
 * and vice versa
 */
public class TemparatureConverter {

	/*
	 * Converts the temperature from fahrenheit to celsius
	 */
	static double toCelsius(double Fahrenheit) {
		double temperatue = Fahrenheit;

		temperatue = ((temperatue - 32) * 5) / 9;

		return temperatue;
	}

	/*
	 * Converts the temperature from celsius to fahrenheit
	 */
	static double toFahrenheit(double Fahrenheit) {
		
		double temperatue = Fahrenheit;

		temperatue = (9.0 / 5.0) * temperatue + 32;

		return temperatue;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperatue in Fahrenheit to convert Celsius ");
		double temperatue = in.nextDouble();
		System.out.println("Enter temperatue in Celsius  to convert Fahrenheit");
		double temperatue1 = in.nextDouble();
		in.close();
		
		double toCelsius = toCelsius(temperatue);
		double toFahrenheit = toFahrenheit(toCelsius);
		System.out.println("temperatue in Celsius : " + toCelsius + "\ntemperatue in Fahrenheit : " + toFahrenheit);

	}
}
