package com.bayamp.training.userdefined.lovely.programs;

import com.bayamp.training.userdefined.lovely.objects.Employee;
import com.bayamp.training.userdefined.lovely.objects.Person;
import com.bayamp.training.userdefined.lovely.objects.Student;

public class PersonProgram {

	
		
	public static void main(String[] args) {
		//here the tostring method of object is getting called, if object do not have tostring implemented,
		//it looks in parent class. by default the object class	returns address
		Person raj = new Student("Raj", "Malhotra", 4.5, "12");
		
		Employee e = new Employee("kiru", "bakar", 1, "123-344-1234");

		Student simran = new Student("Simran", "Kapoor", 5.2, "S12");

		System.out.println(raj);
		System.out.println(raj.getFirstName());
		System.out.println(simran);
		System.out.println(e);
	}
	

}
