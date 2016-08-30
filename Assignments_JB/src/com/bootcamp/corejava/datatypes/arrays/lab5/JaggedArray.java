package com.bootcamp.corejava.datatypes.arrays.lab5;


import java.util.Scanner;

/**
 * @author Jagan REddy
 */
public class JaggedArray {

	/*
	 * Method to print the student courses based on his id(1-4)
	 */
	static void printInfo(int studentId) {

		String[][] studentArray = { { "JAVA", "C ", "C++" }, { "JAVA", "UNIX", "" }, { "Linux", "Oracle", "" },
				{ "RDBMS", "C#", "ORACLE" } };

		System.out.println("Attended the Following cources \n");
		//
		for (int i = 0; i < studentArray.length; i++) {
			if (i == studentId - 1) {
				for (int j = 0; j < studentArray[i].length; j++) {
					System.out.println(studentArray[i][j]);
				}
			}

		}

	}

	public static void main(String[] args) {

		System.out
				.println("Choose student to To see his courses\n1.Tony\n2.Thomas\n3.Dinil\n4.Delvin\n----------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Id (1-4) : ");
		int stId = sc.nextInt();
		sc.close();

		printInfo(stId);

	}

}
