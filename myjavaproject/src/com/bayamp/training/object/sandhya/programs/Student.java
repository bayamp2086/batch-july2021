package com.bayamp.training.object.sandhya.programs;

public class Student {
	String firstName;
	String lastName;
	String studentId;
	double gpa;

	public Student(String firstName, String lastName, String studentId, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStudentId() {
		return studentId;
	}

	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", id=" + studentId
				+ "]";
	}

}
