package com.bootcamp.corejava.oop.inheritance.lab6;


/**
 * @author Jagan Reddy
 *
 */
public class DemoInherit {

	public static void main(String[] args) {

		Address hostelAddress = new Address();
		hostelAddress.setAddressLine("8231 Carpenter pkwy");
		hostelAddress.setCity("Irving");
		hostelAddress.setState("Texas");
		hostelAddress.setZip("75038");

		Hostelite hostelite = new Hostelite("Tommmy", 1757, 75.6f, 'H', "CSE", 4, hostelAddress, "Aaradhya", 105,
				"double");
		
		// Validate Student name
		if (hostelite.validateStudentName()) {
			
			// Validate branch name and marks
			if (hostelite.validateBranchName() && hostelite.validateExamMarks()) {

				System.out.println("Student Id : " + hostelite.getStudentId());
				System.out.println("Student Name : " + hostelite.getStudentName());
				System.out.println("Qualifying Marks : " + hostelite.getQualifyingExamMarks());
				System.out.println("Rsidential Status : " + hostelite.getResidentialStatus());
				System.out.println("Current Year of engineering : " + hostelite.getYearOfEngg());
				System.out.println("Branch Name : " + hostelite.getBranchName());
				System.out.println("Permanent Address : " + hostelAddress.toString());
				System.out.println("Hostel Name : " + hostelite.getHostelName());
				System.out.println("Room Number : " + hostelite.getRoomNum());
				System.out.println("Room Type : " + hostelite.getRoomType());
				System.out.println("\n");
			}
		}

		Address residenceAddress = new Address();
		residenceAddress.setAddressLine("123 Greenway Dr");
		residenceAddress.setCity("Irving");
		residenceAddress.setState("Texas");
		residenceAddress.setZip("75038");

		Address perminentAddress = new Address();
		perminentAddress.setAddressLine("501 Monroe ST");
		perminentAddress.setCity("Dallas");
		perminentAddress.setState("Texas");
		perminentAddress.setZip("75080");

		DayScholar dayScholar = new DayScholar("Timmy", 1234, 80.0f, 'D', "CSE", 4, residenceAddress, 10);
		
		// Validate Student name
		if (dayScholar.validateStudentName()) {
			
			// Validate branch name and marks
			if (dayScholar.validateStudentName() && dayScholar.validateExamMarks()) {
				System.out.println("Student Id : " + dayScholar.getStudentId());
				System.out.println("Student Name : " + dayScholar.getStudentName());
				System.out.println("Qualifying Marks : " + dayScholar.getQualifyingExamMarks());
				System.out.println("Residential Status : " + dayScholar.getResidentialStatus());
				System.out.println("Current Year of Engneering : " + dayScholar.getYearOfEngg());
				System.out.println("BranchName : " + dayScholar.getBranchName());
				System.out.println("Residential Address : " + dayScholar.getResidentialAddress().toString());
				System.out.println("Distance : " + dayScholar.getDistance());
				System.out.println("Permanent Address : " + perminentAddress.toString());

			}
		}
	}
}
