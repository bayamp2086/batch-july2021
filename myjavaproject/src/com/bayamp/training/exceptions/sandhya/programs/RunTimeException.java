package com.bayamp.training.exceptions.sandhya.programs;

public class RunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayOutOfBound Exception
		
		/*
		 * int[] myArray = { 2, 3, 5, 6 }; int myElement = myArray[5];
		 */
		//Null pointer Exception 
		
		String s = "";
		int len = s.length();
		System.out.println("String length is : " + len);
		
		//Arithmetic Exceptions
		
		/*
		 * int num = 10; System.out.println(num/0);
		 */
		
		//Number Format Exception
		
		String number1 =new String( "34a6");
		String number2 =new String( "7892");
		
		String total = number1 + number2; //concatenate
		System.out.println(total); 
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int sum = num1 + num2;
		System.out.println(sum); 
		
		
		
	}

}
