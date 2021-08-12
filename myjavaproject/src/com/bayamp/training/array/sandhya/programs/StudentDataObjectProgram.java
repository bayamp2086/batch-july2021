package com.bayamp.training.array.sandhya.programs;
import com.bayamp.training.object.sandhya.programs.Student;

public class StudentDataObjectProgram {
	String firstName;
	String lastName;
	String studentId;
	double gpa;

	public StudentDataObjectProgram(String firstName, String lastName, String studentId, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.gpa = gpa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  firstStudent = new Student("Johnny", "Depp", "0001", 3.2);
		Student secondStudent = new Student("Ashley","Sutton","0002",3.5);
		
		if(firstStudent == secondStudent) {
			System.out.println("They are same");
		} 
		System.out.println("They are NOT same");
	}

}
