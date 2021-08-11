package com.bayamp.training.divya.generic.programs;
import com.bayamp.training.divya.userdefined.objects.*;

public class StudentDataObjectProgram 
{

	public static void main(String[] args) 
	{
		Student s1=new Student("Rio","Raj",8,"001");
		Student s2=new Student("Roshini","Tom",9,"002");
		Student s3=new Student("Sripad","Vaidya",9,"002");
		
		int totalStudents=Student.getStudentCount();
		
		System.out.println("The total no of students: " +totalStudents);
		

	}

}
