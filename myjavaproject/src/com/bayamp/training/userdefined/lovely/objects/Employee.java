package com.bayamp.training.userdefined.lovely.objects;

public class Employee extends Person {
	
	
	String department;
	String designation;
	int empId;
	String ssn;
	long salary;
	boolean isNightShift;
	String address;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName,int empId,String ssn) {
		super(firstName, lastName);
		this.empId = empId;
		this.ssn = ssn;
		// TODO Auto-generated constructor stub
	}
	
		
	public String getDepartment() {
		return department;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getEmpId() {
		return empId;
	}

	public long getSalary() {
		return salary;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public boolean isNightShift() {
		return isNightShift;
	}
	public void setNightShift(boolean isNightShift) {
		this.isNightShift = isNightShift;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
