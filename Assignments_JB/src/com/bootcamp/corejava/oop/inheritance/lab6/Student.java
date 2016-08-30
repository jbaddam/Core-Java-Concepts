package com.bootcamp.corejava.oop.inheritance.lab6;


/**
 * @author Jagan Reddy
 * This class has a functionality to validate Student name, branch name and marks
 *
 */
public class Student {

	private int studentId;
	private String studentName;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private String branchName;
	private int yearOfEngg;
	private static int counter;

	/**
	 * @param studentName
	 * @param studentId
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 * 
	 * parameterized constructor
	 */
	public Student(String studentName,int studentId, float qualifyingExamMarks, char residentialStatus, String branchName,
			int yearOfEngg) {

		this.studentName = studentName;
		this.studentId=studentId;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.branchName = branchName;
		this.yearOfEngg = yearOfEngg;

	}

	/**
	 * default constructor
	 */
	public Student() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Student.counter = counter;
	}

	/**
	 * Method to validate Student 
	 * @return
	 */
	public boolean validateStudentName() {

		boolean status = false;
		if (getStudentName().length() >= 5 && getStudentName().length() <= 55) {
			status = true;
		} else {

			status = false;
		}
		return status;
	}

	/**
	 * Method to validate BranchName 
	 * @return
	 */
	public boolean validateBranchName() {

		boolean status = false;

		if (getBranchName().equalsIgnoreCase("CSC") || getBranchName().equalsIgnoreCase("ECE")
				|| getBranchName().equalsIgnoreCase("EEE") || getBranchName().equalsIgnoreCase("MECH")
				|| getBranchName().equalsIgnoreCase("BIO-TECH")) {

		} else {

			setBranchName("CSC");
			status = true;

		}
		return status;
	}

	/**
	 * Method to validate ExamMarks
	 * @return
	 */
	public boolean validateExamMarks() {

		boolean status = false;
		if (getQualifyingExamMarks() <= 100 && getQualifyingExamMarks() >= 65) {

			status = true;
		} else {

			status = false;
		}

		return status;
	}

}
