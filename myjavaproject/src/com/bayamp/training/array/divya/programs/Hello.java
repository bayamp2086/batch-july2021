package com.bayamp.training.array.divya.programs;

public class Hello {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Divya");
		sb.append(" Sivakumar");
		sb=new StringBuffer("Sahithya");
		sb.append(" Sivakumar");
		System.out.println(sb);
		// TODO Auto-generated method stub
		
		 int arr[] = {1, 2, 3};
         
	        // final with for-each statement
	        // legal statement
	        for (final int i : arr)
	        {
	        	//i++;
	            System.out.print(i + " ");
	            
	        }

	}

}
