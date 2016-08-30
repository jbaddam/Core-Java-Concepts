package com.joker.java.jaganreddy.lab4;



/**
 * @author Jagan Reddy
 *
 */
public class Demo {
		
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setStudentId(1001);
		student.setQualifyingExamMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		
		System.out.println(" studentId=" + student.getStudentId() + "\n qualifyingExamMarks=" + student.getQualifyingExamMarks()
				+ "\n residentialStatus=" + student.getResidentialStatus() + "\n yearOfEngg=" + student.getYearOfEngg() );
		
	}

}
