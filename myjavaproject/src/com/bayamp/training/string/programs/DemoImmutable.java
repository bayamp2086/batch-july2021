package com.bayamp.training.string.programs;

public class DemoImmutable {
	
	private static final String COMPANY = "bayamp";

	public static void main(String[] args) {
			
	
		//To demonstrate strings are immutable (orignial string that is created is not changeable)
		String s2 = new String("shilpa");

		System.out.println(s2);
		
		s2.concat("123");
		
		System.out.println(s2);
		

		//StringBuffer is mutable(that means changeable)
		
		StringBuffer buff = new StringBuffer("harish");
		
		buff.reverse();
	
		buff.append("123");
		
		System.out.println(buff);
				
		//reverse the string 
		//check if a given string is a palidrome 
		//count the duplicate / repeating characters in a string
		
	}

}
