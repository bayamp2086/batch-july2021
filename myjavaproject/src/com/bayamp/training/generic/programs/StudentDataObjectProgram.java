package com.bayamp.training.generic.programs;

import com.bayamp.training.userdefined.objects.Student;

public class StudentDataObjectProgram {

	public static void main(String[] args) {

		compareStudents();

		//compareStrings();
	}

	private static void compareStudents() {

		Student stud1 = new Student("harish", "appannagari", 5.0, "0001");

		System.out.println(stud1.toString());

		Student stud2 = new Student("harish", "appannagari", 5.0, "0001");
 		
		Student s3 = null;
		
		if (stud1.equals(stud2) ) {

			System.out.println("Two students are same");

		} else {
			System.out.println("two students are NOT same");
		}
		
	
	}

	
	
	
	
	
	
	
	
	
	
	private static void compareStrings() {

		String s1 = new String("bayamp");

		String s2 = new String("bayamp");

		if (s1 == s2) {

			System.out.println("Two strings are same");

		} else {
			System.out.println("two strings are NOT same");
		}

		if (s1.equals(s2)) {

			System.out.println("Two strings are same");

		} else {
			System.out.println("two strings are NOT same");
		}

	}

}
