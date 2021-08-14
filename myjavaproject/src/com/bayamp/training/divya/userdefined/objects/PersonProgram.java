package com.bayamp.training.divya.userdefined.objects;

public class PersonProgram 
{
	public static void main(String[] args)
	{
		Person e1=new Employee("Divya","Sivakumar",100,10000);
		
		//Person e1=new Employee("d","s");
		System.out.println(e1);
		
		//int empId=e1.getEmpId();
		//System.out.println(empId);
		
		String fname=e1.getFname();
		System.out.println(fname);
		e1.print();
		
	}

}
