package com.bayamp.training.userdefined.lovely.objects;

public class Employee extends Person {
	
	
	String department;
	String designation;
	int empId;
	String ssn;
	long salary;
	boolean isNightShift;
	String address;
	
	// in case this default constructor is needed, it needs a default super constructor too
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName,int empId,String ssn) {
		super(firstName, lastName);
		this.empId = empId;
		this.ssn = ssn;		
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
	
	public void setDepartment(String department) {
		this.department = department;
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
	
	@Override
	public String toString() {
		return "Employee [ "+ super.toString() +" department=" + department + ", empId=" + empId + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this==obj) {
			return true;
		}
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Employee emp = (Employee) obj;
		if (!this.firstName.equals(emp.firstName)) {
			return false;
		}
		if (!this.lastName.equals(emp.lastName)) {
			return false;
		}
		if (this.empId != emp.empId) {
			return false;
		}
		if (!this.department.equals(emp.department)) {
			return false;
		}
		
		return true;
	}
	
}
