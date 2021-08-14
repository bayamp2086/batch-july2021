package com.bayamp.training.utils;

public class DivyaArrayUtil
{
		public static boolean linearSearch(int[] myArray,int numberToSearch)
		{
		
			for(int i=0;i<myArray.length;i++)
			{
				if(numberToSearch==myArray[i])
				{
					return true;
				}
				
			}
			return false;
		
		}
		
		public static boolean binarySearch(int[] myArray,int numberToSearch)
		{
			int temp;
			for(int i=0;i<myArray.length;i++) 
			{
				for(int j=i+1;j<myArray.length;j++)
				{
					if(myArray[i]>myArray[j])
					{
						temp=myArray[i];
						myArray[i]=myArray[j];
						myArray[j]=temp;
					}
				}
			}
			
			int start=0;
			int end=myArray.length-1;
			int mid;
			while(start<=end)
			{
				mid=(start+end)/2;
				if (myArray[mid]==numberToSearch)
				{
					return true;
				}
				else if(myArray[mid]>numberToSearch)
				{
					end=mid-1;
					
				}
				else
				{
					start=mid+1;
				}
			}
			return false;
		}
		public static void duplicates(int[] myArray)
		{
			for(int i=0;i<myArray.length;i++)
			{
				for(int j=i+1;j<myArray.length;j++) 
				{
				if (myArray[i]==myArray[j])
				{
					System.out.print(" " +myArray[j]);
				}
				}
			}
		}
		
		public static int[] removingDuplicates(int[] myArray)
		{
			int[] temp=new int[myArray.length];
			int start=0;
			temp[start]=myArray[0];
			for(int i=1;i<myArray.length-1;i++)
			{
				if(myArray[i]!=temp[start])
				{
					start++;
					temp[start]=myArray[i];
				}		
			}return temp;
		}
		
		public static boolean binarSearch(int[] myArray,int numberToSearch)
		{
			int start=0;
			int end=myArray.length-1;
			int mid;
			while(start<=end)
			{
				mid=(start+end)/2;
				if(myArray[mid]==numberToSearch)
				{
					return true;
				}
				else if(myArray[mid]>numberToSearch)
				{
					end=mid-1;
				}
				else if(myArray[mid]<numberToSearch)
				{
					start=mid+1;
				}
			}return false;
		}
		
		public static void myArrayReverse(int[] myArray)
		{
			int j=0;
			int reverseArray[]=new int[myArray.length];
			for(int i=myArray.length-1;i>=0;i--)
			{
				reverseArray[j]=myArray[i];
				j++;
			}
			for(int i=0;i<reverseArray.length;i++)
			{
				System.out.println(reverseArray[i]);
			}
		}
		
		public static void reverseArray(int[] myArray)
		{
			int temp=0;
			int j=myArray.length-1;
			for(int i=0;i<myArray.length/2;i++)
			{
				temp=myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=temp;
				j--;
			}
			for(int i=0;i<myArray.length;i++)
			{
				System.out.println(myArray[i]);
			}
		}
		
		public static int[] sortArray(int[] myArray)
		{
			int temp;
			for(int i=0;i<myArray.length;i++)
			{
				for(int j=i+1;j<myArray.length;j++)
				{
				if(myArray[i]>myArray[j])
				{
					temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
				}
				}
			}
			System.out.println(" ");
			for(int i=0;i<myArray.length;i++)
			{
				System.out.print(" " +myArray[i]);
			}
			return myArray;
		}
		
		public static void duplicatesInArrays(int[] myArray1,int[] myArray2)
		{
			for(int i=0;i<myArray1.length;i++)
			{
				for(int j=0;j<myArray2.length;j++)
				{
					if(myArray1[i]==myArray2[j])
					{
						System.out.println(myArray1[i]);
					}
				}
			}
		}
		
		public static int[] mergeAndSort(int[] myArray1,int[] myArray2)
		{
			int size=myArray1.length+myArray2.length;
			int[] resultArray=new int[size];
			
			for(int i=0;i<myArray1.length;i++)
			{
				resultArray[i]=myArray1[i];
			}
			int j=0;
			for(int i=myArray1.length;i<resultArray.length;i++)
			{
				resultArray[i]=myArray2[j];
				j++;
			}
			for(int i=0;i<resultArray.length;i++)
			{
				System.out.print(" " +resultArray[i]);
			}
			
			return resultArray;
		}
}
