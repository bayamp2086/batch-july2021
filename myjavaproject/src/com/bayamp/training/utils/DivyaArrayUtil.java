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
		


}
