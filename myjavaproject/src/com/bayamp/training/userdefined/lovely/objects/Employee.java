package com.bayamp.training.userdefined.lovely.objects;

import java.util.Comparator;



public class Employee  extends Person  {
	
	
	String department;
	String designation;
	int empId;
	String ssn;
	long salary;
	boolean isNightShift;
	String address;
	static int count;
	
	
	// in case this default constructor is needed, it needs a default super constructor too
	//never let default constructor public
	private Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName,int empId,String ssn) {
		super(firstName, lastName);
		this.empId = empId;
		this.ssn = ssn;
		count++;
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

	

	
	
	@Override
	public String getIdentification() {
		
		return this.empId + this.firstName + this.lastName;
	}
	
	public static int getCount() {
		return count;
	}

	@Override
	public int getWorkingHours() {
		// daily hours + overtime
		return 0;
	}

//	@Override
//	//this is used for sorting elements
//	public int compare(Employee e1, Employee e2) {
//		return e1.firstName.compareTo(e2.firstName);
//	}
//	
	//sort using compareto method on employee first name
	public static void sort(Employee[] emps)
	{
		Employee temp;
		for (int i = 0; i < emps.length; i++) {
            for (int j = i + 1; j < emps.length; j++) {
            	// to compare one string with other strings
                if (emps[i].firstName.compareTo(emps[j].firstName) > 0) {
                    // swapping
                    temp = emps[i];
                    emps[i] = emps[j];
                    emps[j] = temp;
                }
            }
		}
	}
}
