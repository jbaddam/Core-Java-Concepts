package com.bootcamp.corejava.oop.classes.medium.lab4;

/**
 * @author Jagan Reddy
 *  This class has a functionality to validate the student 
 */
public class Student {
	
	private int studentId;
	private String name;
	private String branchName;
	private float qualifyingExamMarks;
	private char residentialStatus;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	private int yearOfEngg;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	
	public char getResidentialStatus() {
		return residentialStatus;
	}
	
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	/**this methods validates the Name
	    * @return true/false
	    */
	public boolean validateStudentName() {
		if(name.length()>=5 && name.length()<=55){
			return true;
		}
		else{
			System.out.println("The length of the name should be minimum 5 characters and a maximum of 25 characters");
			return false;
		}
		
	}
	
   /**this methods validates the branchName
    * @return true/false
    */
     public boolean validateBranchName() {
		if(branchName.equalsIgnoreCase("CSC")|| branchName.equalsIgnoreCase("ECE")
				||branchName.equalsIgnoreCase("EEE")||branchName.equalsIgnoreCase("MECH")|| 
				branchName.equalsIgnoreCase("BIO-TECH")){
			return true;
		}
		else
		{
			System.out.println("\nInvalid Branch Name");
			branchName = "CSC";
			return false;
		}
		
	}
   

	/**this methods validates the qualifyingExamMarks
	 * @return true/false
	 */
   public boolean validateExamMarks(){
	   
	   if(qualifyingExamMarks<=100 && qualifyingExamMarks>=65){
		   return true;
	   }
	   else
	   return false;
	   
   }
   
   
}

