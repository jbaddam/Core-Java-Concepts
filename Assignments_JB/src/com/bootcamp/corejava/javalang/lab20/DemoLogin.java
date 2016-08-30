package com.bootcamp.corejava.javalang.lab20;

/**
 * @author Jagan Reddy
 *
 */
public class DemoLogin {
	
	public static void main(String[] args) {
		Login l = new Login();
		
		if(l.validateLogin()){
			System.out.println("Login Successful");
		}
		else
			System.out.println("Login Denied");
	}

}
