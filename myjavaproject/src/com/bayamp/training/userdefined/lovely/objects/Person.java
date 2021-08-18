package com.bayamp.training.userdefined.lovely.objects;

//abstract class cannot be instantiated
abstract public class Person {
	protected String firstName;
	protected String lastName;
	
	public Person(String firstName, String lastName) {
		//super(); // this is the call to the default parent constructor, this case its object class
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//since a parametrized constructor is created, a default constructed needs to be added, if required.
	public Person()
	{
		
	}

	
	
// getters for first and last name should be in the respective class and not person
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName;
	}


	
	
}