package com.bootcamp.corejava.oop.inheritance.lab6;


/**
 * @author Jagan Reddy
 * DayScholar Entity class
 */
public class DayScholar extends Student {

	Address residentialAddress;
	private float distance;

	/**
	 * @param studentName
	 * @param studentId
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param yearOfEngg
	 * @param residentialAddress
	 * @param distance
	 * 
	 * Parameterized constructor
	 */
	public DayScholar(String studentName,int studentId,float qualifyingExamMarks, char residentialStatus, String branchName,
			int yearOfEngg, Address residentialAddress, float distance) {
		super(studentName, studentId,qualifyingExamMarks, residentialStatus, branchName, yearOfEngg);
		this.residentialAddress = residentialAddress;
		this.distance = distance;
	}
	
	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

}
