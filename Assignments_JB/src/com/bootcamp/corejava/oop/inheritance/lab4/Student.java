package com.bootcamp.corejava.oop.inheritance.lab4;

/**
 * @author Jagan Reddy
 * Student entity class
 */
public class Student {
	
     protected String studentName;
	 protected int id;
	 protected String schoolName;
	 protected String currentYear;
		
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}
	 
	
}
