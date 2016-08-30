package com.bootcamp.corejava.datatypes.strings.lab3;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Jagan Reddy
 * Email Validation
 */
public class EmailValidation {
	private String emailId;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	/*
	 * Verifies  The given email
	 */
	static void emailValidation(String mail){
		int count = 0;
		
		//Length of the email ID must be greater than 3 and less 20
		if (mail.length() > 3 && mail.length() < 20) {
			
			//email ID must include “@” 
			if (mail.contains("@")) {
				for (int i = 0; i < mail.length(); i++) {
					
					//counting " . " in Email
					if (mail.charAt(i) == '.') {
						count++;
					}
				}
				//Email contains minimum of 1 and maximum of 2 “.”
				if (count > 0 && count < 3) {
					String subString = mail.substring(0, mail.indexOf('@'));
					
					//Regular Expression for The substring before “@”must contain 
					//a combination of Upper case, Lower case and “_”  symbols
					Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[_]).+$");
					Matcher m = p.matcher(subString);
					boolean b = m.find();
					if (b == true) {
						
						//Condition First letter of email should be CAPITAL LETTER
						if (Character.isUpperCase(mail.trim().charAt(0))) {
							System.out.println("Valid Email");
						} else
							System.out.println("First Letter of Email should be Capital");
					} else
						System.out.println(
								"Your Email should contain atleast one Upper & Lower case Letter"
								+ "\n and a Special Character( _ ) before @");
				} else
					System.out.println("Email should Contain Minimum 1 Dot( . ) Max 2 Dots( . ) Are allowed");
			}

			else
				System.out.println("Invalid Position of Special Characters");
		} else
			System.out.println("Invalid Length of email Id");

	}

	public static void main(String[] args) {
		
		System.out.println("Enter your email id");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine().trim();
		EmailValidation emailValidation = new EmailValidation();
		emailValidation.setEmailId(email);
		String validateEmail = emailValidation.getEmailId();
		sc.close();
		
		
		emailValidation(validateEmail);
		
	}
}
