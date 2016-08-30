package com.bootcamp.corejava.flowcontrols.lab6;

import java.util.Scanner;

/**
 * @author Jagan Reddy
 */
public class CreditLimit {
	
	/**
	 * Accepts customers following details
	 * @param accountNumber 
	 * @param beginingBalance 
	 * @param itemsCost
	 * @param totalCredits
	 * @param creditLimit
	 * And shows  ,whether the customer reached his credit limit or not
	 */
	public static void calculateBalance(long accountNumber , double beginingBalance,
			double itemsCost,double totalCredits, double creditLimit){
		
		double newBalance = beginingBalance + itemsCost - totalCredits;
		
		if(newBalance > creditLimit){
			System.out.println("Credit limit exceeded");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Customer's Account Number :");
		long accNumber = sc.nextLong();
		
		System.out.print("Begining Balance");
		double begBalance = sc.nextDouble();
		
		System.out.print("Total Cost of Items:");
		long cost = sc.nextLong();
		
		System.out.print("Total credits :");
		long credit = sc.nextLong();
		
		System.out.print("Credit Limit :");
		long creditlimit = sc.nextLong();	
		
		calculateBalance(accNumber , begBalance, cost, credit, creditlimit);
		 sc.close();
		
	}

}
