package com.bayamp.training.divya.userdefined.objects;

public class Employee 
{
	private int empId;
	private String empName;
	private double empSalary;
	private String empDepartment;
	public Employee(int empId,String empName,double empSalary,String empDepartment)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDepartment=empDepartment;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public double getEmpSalary()
	{
		return empSalary;
	}
	public String getEmpDepartment()
	{
		return empDepartment;
	}
	public void setEmpSalary(double empSalary)
	{
		this.empSalary=empSalary;
	}
	public void setEmpDepartment(String empDepartment)
	{
		this.empDepartment=empDepartment;
	}

}
