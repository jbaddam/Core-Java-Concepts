package com.bootcamp.corejava.javalang.lab20;


/**
 * @author Jagan Reddy
 * this class has functionality to validate the login
 */
public class Login {

	private static  String[] userNames;
	private static  String[] passWords;
	private   String userName;
	private   String passWord;
	
	
	//static block
	static{
		String[] usernamesArray = {"admin","finance","student"};		
		String[] passwordsArray = {"Admin","Finance","Student"};
		
		Login.setUserNames(usernamesArray);
		Login.setPassWords(passwordsArray);
		
	}
	
	public Login(){
		this.userName = "student";
		this.passWord = "Student";
	}
	
	
	
	public static String[] getUserNames() {
		return userNames;
	}



	public static void setUserNames(String[] userNames) {
		Login.userNames = userNames;
	}



	public static String[] getPassWords() {
		return passWords;
	}



	public static void setPassWords(String[] passWords) {
		Login.passWords = passWords;
	}



	/**
	 * @return
	 * this method validates the username and password
	 */
	public boolean validateLogin(){
		
		for (int i = 0; i < userNames.length; i++) {
			if(userName.equals(userNames[i]) && passWord.equals(passWords[i])){
				return true;
			}			
		}
		
		return false;
		
	}		
}
