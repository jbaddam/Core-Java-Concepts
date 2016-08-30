package com.bootcamp.corejava.flowcontrols.lab5;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 * This class a functionality to calculate the salary of sales persons
 */
public class SalesPersonErning {
	
	
	
	/**
	 * @param amount accepts total sales done by sales person
	 * and shows the salary of a sales person based on the % given by company 
	 */
	public static void claculateCommission(double amount){
		
		double weekSalary = 200 + (amount)*9/100;
		System.out.print("Toatal Salary = "+weekSalary);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double totalAmount = 0;
		System.out.print("How Many Items Sold by Customer in Last Week \n");
		int items = sc.nextInt();
		for (int i = 0; i < items; i++) {
			System.out.print("Enter  Item "+(i+1)+" price :");
			double price = sc.nextDouble();
			totalAmount += price;
		}
				
		claculateCommission(totalAmount);
		sc.close();
	}

}
