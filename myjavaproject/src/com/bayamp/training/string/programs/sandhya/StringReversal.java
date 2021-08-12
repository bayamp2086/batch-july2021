package com.bayamp.training.string.programs.sandhya;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSwapReverse("Lets swap this");
		StringBufferReverse("I have done it!");
		StringReverseChatAt("Using Char At");
	}
	
	private static void StringSwapReverse(String reverseString) {
		char[] charArray = reverseString.toCharArray();
		int length = charArray.length;
		String swappedString = new String();
		char tempChar;
		
		for(int i=0;i<length;i++) {
		tempChar = charArray[i];
		charArray[i] = charArray[length - 1];
		charArray[length - 1] = tempChar;
		swappedString =new String(charArray);
		length--;
		}
		
		System.out.println("Reverse of given String using Swap method is: '" + swappedString + "'");
	}
	
	private static void StringBufferReverse(String str) {
		StringBuffer reverseStr = new StringBuffer(str);
		
		System.out.println("Reverse of given String using String Buffer is: '" + reverseStr.reverse().toString()+ "'" );
	}
	
	private static void StringReverseChatAt (String givenString) {
		
		char[] charArray = givenString.toCharArray();
		System.out.print("Reverse of given String using CharAt is: ");
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i] );
		}
		System.out.println();
	}

}
