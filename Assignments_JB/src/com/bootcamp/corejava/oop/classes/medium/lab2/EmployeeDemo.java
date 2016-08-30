package com.bootcamp.corejava.oop.classes.medium.lab2;


/**
 * @author Jagan Reddy
 *
 */
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setFirstName("Vinay Reddy");
		emp1.setLastName("sevella");
		emp1.setSalary(-10000.023);
		
		System.out.println("Annual Salry of "+emp1.getFirstName()+" "+ emp1.getLastName()+" is "+12*emp1.getSalary() );
		System.out.println("Annual salry after 10 % increment "+(12*emp1.getSalary())*1.10);
		
		emp2.setFirstName("Linga Reddy");
		emp2.setLastName("Baddam");
		emp2.setSalary(15000.325);
		
		System.out.println("\n\nAnnual Salry of "+emp2.getFirstName()+" "+ emp2.getLastName()+" is "+12*emp2.getSalary() );
		System.out.println("Annual salry after 10 % increment "+(12*emp2.getSalary())*1.10);
		
	}

}
