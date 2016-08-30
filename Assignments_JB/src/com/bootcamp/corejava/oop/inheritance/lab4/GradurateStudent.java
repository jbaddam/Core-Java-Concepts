package com.bootcamp.corejava.oop.inheritance.lab4;


/**
 * @author Jagan Reddy
 * This class has functionality to check whether student graduated or not?
 */
public class GradurateStudent extends Student{
	
	private static final int TOTAL_GRAD_CREDITS = 36;
	private String gradMajor;
	private int creditsCompleted;
	
	public String getGradMajor() {
		return gradMajor;
	}
	public void setGradMajor(String gradMajor) {
		this.gradMajor = gradMajor;
	}
	
	public static int getTotalCredits() {
		return TOTAL_GRAD_CREDITS;
	}
		
	public static int getTotalGradCredits() {
		return TOTAL_GRAD_CREDITS;
	}
	public int getCreditsCompleted() {
		return creditsCompleted;
	}

	public void setCreditsCompleted(int creditsCompleted) {
		this.creditsCompleted = creditsCompleted;
	}

	public boolean isGraduated(){
		
		if(TOTAL_GRAD_CREDITS == creditsCompleted){
			return true;
		}else
		return false;
	}
	@Override
	public String toString() {
		return "StudentName = "	+ getStudentName()+ "\nStudentId = " + getId() + "\nCurrentYear = " + getCurrentYear() +" \nGradMajor = " + getGradMajor() + "\nCreditsCompleted = " + getCreditsCompleted()
				 + "\nSchoolName = " + getSchoolName() ;
	}
	
	
	
	
		
}
