package com.bayamp.training.string.divya.programs;
import com.bayamp.training.utils.DivyaStringUtil;
import java.util.Scanner;
class MyStringProgram
{
	public static void main(String[] args)
	{
	String myString;
	String myString1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the string");
	myString=obj.nextLine();
	
	System.out.println("Enter the string2");
	myString1=obj.nextLine();
		
	DivyaStringUtil.reverseString(myString);
	
	boolean result=DivyaStringUtil.palindrome(myString);
	System.out.println(result);
	
	DivyaStringUtil.reverseWord(myString);
	
	DivyaStringUtil.OrderReverseString(myString);
	
	DivyaStringUtil.areAnagram(myString,myString1);
	
	int count=DivyaStringUtil.countChars(myString);
	System.out.println("The count of characters in the string: " +count);
	}
}