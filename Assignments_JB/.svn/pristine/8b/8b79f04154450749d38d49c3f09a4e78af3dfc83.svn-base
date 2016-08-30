package com.bootcamp.corejava.oop.overloading.lab2;

import java.util.Date;



/**
 * @author Jagan Reddy
 * Employee entity class has overloaded constructors
 */
public class Employee {
	
	String firstName; 
	String lastName; 
	int employeeId; 
	Date dateOfBirth;
	
	Employee(String firstName){
		
		this.firstName = firstName;
	}
	
	Employee(String firstName, String lastName){
		
		this(firstName);
		this.lastName = lastName;
	}
	
	Employee(String firstName, String lastName, int employeeId){
		
		this(firstName,lastName);
		this.employeeId = employeeId;
	}
	Employee(String firstName, String lastName, int employeeId, Date dateOfBirth){
		
		this(firstName ,lastName , employeeId);
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee Deatils \n\nName=" + firstName +" "+ lastName + "\nemployeeId=" + employeeId
				+ "\ndateOfBirth=" + dateOfBirth ;
	}

	
	public static void main(String[] args) {
		Employee employee = new Employee("Jagan Reddy", "Baddam", 1757, new Date("09/27/1990"));
		System.out.println(employee.toString());
	}
}
