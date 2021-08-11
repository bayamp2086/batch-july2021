package com.bayamp.training.divya.userdefined.objects;

public class Student
{
	private String firstName;
	private String lastName;
	public double gpa;
	private String id;
	private static int count=0;
	public Student(String firstName, String lastName, double gpa, String id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.id = id;
		count++;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public double getGpa()
	{
		return gpa;
	}
	public String getId() 
	{
		return id;
	}
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public String toString()
	{
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + ", id=" + id + "]";
	}
	public static int getStudentCount() 
	{
		
		return count;
	}
	

}
