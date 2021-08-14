package com.bayamp.training.utils;

public class DivyaStringUtil

{
	public static void reverseString(String myString) throws Exception 
	{
		if (myString==null)
		{
			throw new Exception("The input String cannot be null");
		}
		int start = 0;
		int end = (myString.length()) - 1;
		char[] tc = myString.toCharArray();
		char temp;
		String result;
		while (start <= end) {
			temp = tc[start];
			tc[start] = tc[end];
			tc[end] = temp;
			start++;
			end--;
		}
		myString = String.valueOf(tc);
		// result=new String(tc);
		System.out.println("The reversed string is " + myString);
	}

	public static boolean palindrome(String myString) {
		int start = 0;
		int end = myString.length() - 1;
		char[] tc = myString.toCharArray();
		char temp;
		String result;
		while (start <= end) {
			temp = tc[start];
			tc[start] = tc[end];
			tc[end] = temp;
			start++;
			end--;
		}
		result = new String(tc);
		if (myString.equals(result)) {
			System.out.println("The entered string is a palindrome");
			return true;
		} else {
			System.out.println("The given string is not a palindrome");
			return false;
		}

	}

	public static void reverseWord(String myString) {
		String[] words = myString.split(" ");

		String temp;
		int start = 0;
		int end = words.length - 1;
		while (start <= end) {
			// System.out.println(words[start]);
			// System.out.println(words[end]);
			temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}
		String reversedWords;
		reversedWords = String.join(" ", words);
		System.out.println("The Reversed String sentence is:" + reversedWords);
		// System.out.println("The reversed words : " +words);
	}

	public static int countChars(String myString) {
		char[] tc = myString.toCharArray();
		int n = tc.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (tc[i] != ' ') {
				count++;
			}
		}
		return count;
	}

	public static void OrderReverseString(String myString) {
		String[] words = myString.split(" ");
		int start = 0;
		int end = words.length - 1;
		String temp;
		while (start <= end) {
			temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}
		start = 0;
		end = 1;
		while (end < words.length) {
			temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start = start + 2;
			end = end + 2;
		}

		String reverseStringSwap;
		reverseStringSwap = String.join(" ", words);
		System.out.println("The reversed string is: " + reverseStringSwap);
	}

	public static void areAnagram(String myString1, String myString2) {
		char[] s1 = myString1.toCharArray();
		char[] s2 = myString2.toCharArray();
		char temp;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 1; j < s1.length; j++) {
				if (s1[i] < s1[j]) {
					temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		for (int i = 0; i < s2.length; i++) {
			for (int j = 1; j < s2.length; j++) {
				if (s2[i] < s2[j]) {
					temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}
			}
		}
		myString1 = String.valueOf(s1);
		myString2 = String.valueOf(s2);
		// System.out.println(s1);
		// System.out.println(s2);
		if (myString1.equals(myString2)) {
			System.out.println("The given string is an anagram");
		} else {
			System.out.println("The given string is not an anagram");
		}
	}

	public static void strBufferReverse() {
		StringBuffer myString = new StringBuffer();
		myString.append("Divya");
		myString.reverse();
		System.out.println("The reversed string is " + myString);
	}

	public static String reverseWithoutTemp(String myString) {
		if (myString == null || myString.isEmpty()) {
			return myString;
		}
		String reverse = "";
		for (int i = myString.length() - 1; i >= 0; i--) {
			reverse = reverse + myString.charAt(i);
		}
		return reverse;
	}
	
	public static void reverse(String str) throws Exception
	{
		if(str==null)
		{
			throw new Exception("The input string cannot be null");
		}
	}
	
	public static String strRe(String myString)
	{
		char[] ch=myString.toCharArray();
		int start=0;
		int end=myString.length()-1;
		char temp;
		while(start<=end)
		{
			if(ch[start]!=' ' && ch[end]!=' ')
			{
			temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			}
			else 
			{
			if(ch[start]==' ')
			{
				start++;
			}
			if(ch[end]==' ')
			{
				end--;
			}
			}
		}
		myString=String.valueOf(ch);
		return myString;
		
	}

}
