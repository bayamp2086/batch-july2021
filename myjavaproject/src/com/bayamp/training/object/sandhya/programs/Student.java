package com.bayamp.training.object.sandhya.programs;

import java.util.Objects;

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
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", id=" + studentId + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName)
				&& Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(studentId, other.studentId);
	}
	
	

}
