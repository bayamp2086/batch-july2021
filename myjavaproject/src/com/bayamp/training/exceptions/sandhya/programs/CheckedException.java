package com.bayamp.training.exceptions.sandhya.programs;

import com.bayamp.training.stringutil.sandhya.StringUtil;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = null; 
		String str2 = "bayamp";
		
		String reversedString1;
		String reversedString2;
		
		try {
			reversedString1 = StringUtil.reverse(str1);
			System.out.println(reversedString1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("found an Exception");
		}
		

		try {
			reversedString2 = StringUtil.reverse(str2);
			System.out.println(reversedString2);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("found an Exception");
		}
	}


}
