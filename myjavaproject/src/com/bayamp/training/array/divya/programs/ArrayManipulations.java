package com.bayamp.training.array.divya.programs;
import com.bayamp.training.utils.DivyaArrayUtil;
import java.util.Scanner;

public class ArrayManipulations 
{
	public static void main(String[] args)
	{
		int[] myArray;
		int numberToSearch;
		int size;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size=obj.nextInt();
		
		System.out.println("Enter the elements in the array");
		myArray=new int[size];
		for(int i=0;i<size;i++)
		{
			myArray[i]=obj.nextInt();
		}
		
		System.out.println("Enter the element to search");
		numberToSearch=obj.nextInt();
		
		
		boolean linearSearchResult=DivyaArrayUtil.linearSearch(myArray,numberToSearch);
		if(linearSearchResult)
		{
		System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		boolean binarySearchResult=DivyaArrayUtil.binarySearch(myArray,numberToSearch);
		if(binarySearchResult)
		{
		System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}

