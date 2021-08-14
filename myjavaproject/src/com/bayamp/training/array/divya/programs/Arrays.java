package com.bayamp.training.array.divya.programs;

import com.bayamp.training.utils.DivyaArrayUtil;

public class Arrays {

	public static void main(String[] args) 
	{
		int[] myArray= {1,2,1,2,1};
		//DivyaArrayUtil.myArrayReverse(myArray);
		
		//DivyaArrayUtil.reverseArray(myArray);
		
		int[] sortedArray;
		sortedArray=DivyaArrayUtil.sortArray(myArray);
		DivyaArrayUtil.duplicates(sortedArray);
		
		
		int[] removedDuplicates=DivyaArrayUtil.removingDuplicates(sortedArray);
		System.out.println();
		for(int i=0;i<removedDuplicates.length;i++)
		{
			System.out.print(" " +removedDuplicates[i]);
		}
		
		
		int[] myArray1= {1,3,5,7,2};
		int[] myArray2= {8,3,1,2,5,7,9,1};
		
		//DivyaArrayUtil.duplicatesInArrays(myArray1, myArray2);
		
		//int[] mergeArray=DivyaArrayUtil.mergeAndSort(myArray1, myArray2);
		//DivyaArrayUtil.sortArray(mergeArray);
	}

}
