package com.bayamp.training.array.sandhya.programs;
import com.bayamp.training.object.sandhya.programs.BankEmployees;

public class BankEmployeeData {
	public String empFirstName;
	public String empLastName;
	public int workYears;
	public double salary;
	
	public  BankEmployeeData(String empFirstName, String empLastName, int workYears, double salary) {
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.workYears = workYears;
		this.salary = salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankEmployees emp1 = new BankEmployees("Robert","Downey", 1, 1234.00);
		BankEmployees emp2 = new BankEmployees("Roberta","Sutter", 5, 12345.00);
		BankEmployees emp4 = new BankEmployees("Robert","Downey", 1, 1234.00);
		
		if(emp1 == emp2) {
			System.out.println("They are same");
		} 
		System.out.println("They are NOT same");

		
		
		if(emp1.equals(emp4)) {
			System.out.println("They are same");
		} 
		System.out.println("They are NOT same");
	}

}
