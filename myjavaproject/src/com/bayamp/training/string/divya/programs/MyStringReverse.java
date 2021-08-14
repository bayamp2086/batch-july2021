package com.bayamp.training.string.divya.programs;

import com.bayamp.training.utils.DivyaStringUtil;

public class MyStringReverse {
	
	public static void strRev(String myString)
	{
		char[] ch=myString.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		}
		myString=String.valueOf(ch);
		System.out.println(myString);
	}
	
	public static int spaceCount(String myString)
	{
		char[] ch=myString.toCharArray();
		int space=0;
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]==' ')
			{
				space++;
			}
		}return space;
	}
	
	public static String removeSpaces(String myString,int space)
	{
		char[] ch=myString.toCharArray();
		char[] result=new char[ch.length];
		int pos=0;
		int countspace=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				result[pos]=ch[i];
				pos++;
			}
			else if(ch[i]==' ')
			{
				countspace++;
				if(countspace==space)
				{
					result[pos]=ch[i];
					pos++;
				}
			}
		}
		myString=String.valueOf(result);
		return myString;
	}

	public static void main(String[] args) 
	{
		String result=DivyaStringUtil.strRe("sahithya is a beautiful girl");
		System.out.println(result);
		
		strRev("bayamp");
		
		String myString="H A P  P Y";
		int space=spaceCount(myString);
		String res=removeSpaces(myString,space);
		System.out.println(res);
		

	}

}
