package com.bayamp.training.userdefined.lovely.programs;

import com.bayamp.training.userdefined.lovely.objects.Employee;
import com.bayamp.training.userdefined.lovely.objects.Person;
import com.bayamp.training.userdefined.lovely.objects.Student;

public class PersonProgram {

	
		
	public static void main(String[] args) {
		Person[] personArray = new Person[5];
		Person raj = new Student("Raj", "Malhotra", 4.5, "12");
		personArray[0] = raj;
		Employee e1 = new Employee("kiru", "bakar", 1, "123-344-1234");
		e1.setDepartment("Finance");
		personArray[1] = e1;
		//here parent is representing the child, static binding happens at compile time, where
		// the method should exist in the class, unless it is an extended class. dynamic binding happens at runtime.
		//depending on the type of the new object, that method gets called.
		Employee e2 = new Employee("rishi", "jha", 2, "123-345-1234");
		e2.setDepartment("Human Resource");
		personArray[2] = e2;
		Employee e3 = new Employee("kiru", "bakar", 1, "123-344-1235");
		e3.setDepartment("Finance");
		personArray[3] = e3;
		Student simran = new Student("Simran", "Kapoor", 5.2, "S12");
		personArray[4] = simran;
		
		
//		here the tostring method of object is getting called, 
//		if object do not have tostring implemented,
//		it looks in parent class. by default the object class	returns address
		
		System.out.println(raj);
		System.out.println(raj.getFirstName());
		System.out.println(simran);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.getIdentification());
		System.out.println(Employee.getCount());
		System.out.println(Student.getCount());
		System.out.println(Person.getCount());
		
		for (Person person : personArray) {
			System.out.println(person.getValue());
		}
		
	}
	

}
