package com.bayamp.training.string.programs.sandhya;

public class ConvertStringToInt {

	private static String str = ("3456");

	public static void main(String[] args) {

		int charToInt =0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				charToInt =+str.charAt(i);
				System.out.println(charToInt);
			}
		}
	}

}
