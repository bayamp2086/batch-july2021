package com.bayamp.training.userdefined.lovely.objects;

public class Student extends Person implements PersonI {

	
	public double gpa;
	private String id;
	static int count;
	
	
	public Student(String firstName, String lastName, double gpa, String id) {
		super(firstName,lastName);		
		this.gpa = gpa;
		this.id = id;
		count++;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + ", id=" + id + "]";
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
		
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	// this is equals method overloading, as signature is different.
	public boolean equals(Student student) {
		return true;
	}

	@Override
	public String getIdentification() {		
		return this.id + this.firstName + this.lastName;
	}

	
	public static int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
}
