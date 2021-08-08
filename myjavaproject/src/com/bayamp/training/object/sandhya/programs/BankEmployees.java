package com.bayamp.training.object.sandhya.programs;

public class BankEmployees {
	public  String empFirstName;
	public  String empLastName;
	public  int workYears;
	public  double salary;
	
	public  BankEmployees(String empFirstName, String empLastName, int workYears, double salary) {
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.workYears = workYears;
		this.salary = salary;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public  void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public int getWorkYears() {
		return workYears;
	}
	
	@Override
	public String toString() {
		return "BankEmployees []";
	}
	

}
