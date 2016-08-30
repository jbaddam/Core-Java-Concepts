package com.bootcamp.corejava.oop.inheritance.lab4;

/**
 * @author Jagan Reddy
 *
 */
public class StudentDemo {
	
	public static void main(String[] args) {
		
		MastersStudent ms = new MastersStudent();
		ms.setStudentName("Jagan Reddy");
		ms.setId(1757);
		ms.setSchoolName("California State University");
		ms.setGradMajor("MSCS");
		ms.setCurrentYear("Final Year");
		ms.setCreditsCompleted(36);
		ms.setProjectTitle("Cloud Services for students");
		
		if(ms.isGraduated()){
		
			System.out.println("Congrats! \nYou are Graduated");
		System.out.println(ms.toString());
		System.out.println("project = "+ms.getProjectTitle());
		}else{
			System.out.println("Student Not Garduated \nCredits to be completed  = "+(MastersStudent.getTotalGradCredits()-ms.getCreditsCompleted()));
		}
		
		
		Fresher fr = new Fresher();
		fr.setStudentName("Vinay Reddy");
		fr.setId(1457);
		fr.setSchoolName("UT Dallas");
		fr.setUnderGradMajor("BCA");
		fr.setCurrentYear("1st Year");
		fr.setCreditsCompleted(6);
		fr.setSeminorTopic("Search Engines");
		
		if(fr.isUnderGraduated()){
		
		System.out.println("Congrats! \nYou are UnderGraduated");
		System.out.println("\n\n"+fr.toString());
		System.out.println("Semionr given on = "+fr.getSeminorTopic());
		}else{
		System.out.println("\n\nStudent Not UnderGraduated \nCredits to be completed  = "+(UnderGradStudent.getTotalCredits()-fr.getCreditsCompleted()));
		}
		
		
		
		Fresher sr = new Fresher();
		sr.setStudentName("Lasya");
		sr.setId(1234);
		sr.setSchoolName("UT Dallas");
		sr.setUnderGradMajor("BCA");
		sr.setCurrentYear("4th Year");
		sr.setCreditsCompleted(28);
		sr.setSeminorTopic("Auto pilot");
		
		if(sr.isUnderGraduated()){
		
		System.out.println("\n\nCongrats! \nYou are UnderGraduated");
		System.out.println("\n"+sr.toString());
		System.out.println("Semionr given on = "+sr.getSeminorTopic());
		}else{
		System.out.println("\n\nStudent Not UnderGraduated \nCredits to be completed  = "+(UnderGradStudent.getTotalCredits()-sr.getCreditsCompleted()));
		}
		
	}

}
