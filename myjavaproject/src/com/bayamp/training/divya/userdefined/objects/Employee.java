package com.bayamp.training.divya.userdefined.objects;

public class Employee extends Person
{
	private int empId;
	private double empSalary;
	
	public Employee(String fname,String lname,int empId,double empSalary)
	{
		
		super(fname,lname);
		this.empId=empId;
		this.empSalary=empSalary;	
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public double getEmpSalary()
	{
		return empSalary;
	}
	@Override
	public String toString() 
	{
		return " [empId=" + empId + ", empSalary=" + empSalary + "]" +super.toString();
	}
	/*
	 * public void print() { System.out.println("Employee class"); }
	 */
}
