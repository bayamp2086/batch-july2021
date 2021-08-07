package com.bayamp.training.array.programs;

import java.util.Arrays;

public class MyArrayPrograms {
	
	public static void main(String[] args) {
		
		String s1 = "bayamp";
		
		char[] myChars = s1.toCharArray();
		
		//enhanced for loop 
		for(char c : myChars) {
			
			System.out.println(c);
		}
		
		
		int[] myArray = {29,11,20,11,23};
		
		Arrays.sort(myArray);
		
		for(int i : myArray) {
			
			System.out.println(i);
		}
	}

	
	
}
