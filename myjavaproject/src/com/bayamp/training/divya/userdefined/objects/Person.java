package com.bayamp.training.divya.userdefined.objects;

public class Person 
{
	private String fname;
	private String lname;
	
	
	
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + "]";
	}
	
	  public void print() 
	  { 
		  System.out.println("Person class"); 
	  }
	 
	
}
