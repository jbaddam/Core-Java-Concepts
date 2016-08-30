package com.darknight.java.jaganreddy.lab1;

import java.util.Random;

/**
 * @author Jagan Reddy
 * This class has functionality to generates aplhanumeric password
 */
public class Password {

	/**
	 * Method to generates the password
	 * @param length of the password to be generated
	 * @return the password
	 */
	public static StringBuilder generatePassword(int length) {
		StringBuilder password = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i <= length; i++) {

			if (i % 2 == 0) {

				password.append((char) (random.nextInt(26) + 'a'));

			} else {

				password.append(random.nextInt(10));
			}

		}
		return password;
	}

	public static void main(String[] args) {
		System.out.println("Alpha Numeric password is : "+generatePassword(8));
	}
}
