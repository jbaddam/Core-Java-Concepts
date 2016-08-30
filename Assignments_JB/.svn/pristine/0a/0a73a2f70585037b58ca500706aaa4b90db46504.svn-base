package com.bootcamp.corejava.oop.inheritance.lab4;


/**
 * @author Jagan Reddy
 * This class has functionality to check whether student Under graduated or not?
 */
public class UnderGradStudent extends Student{
	
	private static final int TOTAL_UG_CREDITS = 28;
	private String underGradMajor;
	private int creditsCompleted;
	
	
	public String getUnderGradMajor() {
		return underGradMajor;
	}
	
	public void setUnderGradMajor(String underGradMajor) {
		this.underGradMajor = underGradMajor;
	}

	public int getCreditsCompleted() {
		return creditsCompleted;
	}

	public void setCreditsCompleted(int creditsCompleted) {
		this.creditsCompleted = creditsCompleted;
	}

	public static int getTotalCredits() {
		return TOTAL_UG_CREDITS;
	}
	
public boolean isUnderGraduated(){
		
		if(TOTAL_UG_CREDITS == creditsCompleted){
			return true;
		}else
		return false;
	}
	
	
	@Override
	public String toString() {
		return "StudentName = "	+ getStudentName()+ "\nStudentId = " + getId() + "\nCurrentYear = " + getCurrentYear() +" \nGradMajor = " + getUnderGradMajor() + "\nCreditsCompleted = " + getCreditsCompleted()
				 + "\nSchoolName = " + getSchoolName() ;
	}
	
	
	
	
}
