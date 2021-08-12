package com.bayamp.training.object.sandhya.programs;

import java.util.Objects;

public class BankEmployees {
	public String empFirstName;
	public String empLastName;
	public int workYears;
	public double salary;

	public BankEmployees(String empFirstName, String empLastName, int workYears, double salary) {
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.workYears = workYears;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankEmployees other = (BankEmployees) obj;
		return Objects.equals(empFirstName, other.empFirstName) && Objects.equals(empLastName, other.empLastName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& workYears == other.workYears;
	}

	public int getWorkYears() {
		return workYears;
	}

	@Override
	public String toString() {
		return "BankEmployees [firstName=\" + empFirstName + \", LastName=\" + empLastName + \", numberOfYearsWorked =\" + workYears + \", Salary=\" + salary\n"
				+ "]";
	}

}
