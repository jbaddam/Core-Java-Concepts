package com.bootcamp.corejava.datatypes.strings.lab5;


/**
 * @author Jagan Reddy This class has functionalities to validate the phone
 *         number and IP Address
 */
public class Validator {

	/**
	 * @param phoneNumber
	 * Validates the phoneNumber using REGEX.
	 */
	public boolean validatePhoneNumber(String phoneNumber) {

		if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {
			return true;
		} else
			return false;
	}

	/**
	 * @param ipAddress
	 * Validates the ipAddress using REGEX.
	 */
	public boolean validateIPAddress(String ipAddress) {

		if (ipAddress.matches("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])")) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		Validator vl = new Validator();
		System.out.println(vl.validateIPAddress("127.0.0.1"));
		System.out.println(vl.validatePhoneNumber("571-216-6856"));
	}

}
