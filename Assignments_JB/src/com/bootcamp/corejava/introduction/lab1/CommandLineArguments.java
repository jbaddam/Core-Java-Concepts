package com.bootcamp.corejava.introduction.lab1;

/**
 * @author Jagan Reddy
 * class has a functionality to accepts Command line arguments
 */
public class CommandLineArguments {

	public static void main(String[] args) {
		
		String fname = args[0];// stores String into fname when we pass from command line
		String lname = args[1];// stores String into lname when we pass from command line	
		int age = Integer.parseInt(args[2]);//storing into a integer after parsing the String into Integer, when we pass from command line	
		
		System.out.println("Student Name : " + fname + "  " + lname + "\nStudents age: " + age);
		

	}
}
