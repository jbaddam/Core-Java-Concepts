package com.bootcamp.corejava.flowcontrols.lab3;


import java.util.Scanner;

/**
 * @author Jagan Reddy
 *
 */
public class SwitchCase {

	/**
	 * @param grade 
	 * This method takes the Grade character as input and 
	 * prints the Range of marks
	 */
	static void rangeOfGrades(char grade) {
		switch (grade) {
		case 'A':
			System.out.println(grade + "---> Grade Range of marks 80-100 ");
			break;

		case 'B':
			System.out.println(grade + "---> Grade Range of marks 73-79 ");
			break;
			
		case 'C':
			System.out.println(grade + "---> Grade Range of marks 65-72 ");
			break;
			
		case 'D':
			System.out.println(grade + "---> Grade Range of marks 55-64 ");
			break;
			
		case 'E':
			System.out.println(grade + "---> Grade Range of marks <55 ");
			break;
			
		default:
			System.out.println("OOOPS !  No Range is given for your Grade");
			break;
			
		}
	}

	public static void main(String[] args) {
		
		System.out.print("enter the grade A/B/C/D/E : ");
		
		Scanner sc = new Scanner(System.in);
		String grade=sc.next();
		
		if(grade.trim().length() == 1){
		
			char c = grade.charAt(0);
			rangeOfGrades(c);
		}
		else
			System.out.println("Enter only one character");
		
		sc.close();

	}

}
