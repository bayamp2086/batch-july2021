package com.bayamp.training.array.divya.programs;

import com.bayamp.training.utils.DivyaArrayUtil;

public class Hello {

	public static void main(String[] args) {
	
		int[] myArray= {1,2,3,2,1};
		
		int[] myArray1= {1,1,2,2,2,3};
		int size=6;
	        
	    //DivyaArrayUtil.duplicates(myArray);
	    
	    //int result=DivyaArrayUtil.removingDuplicates(myArray1, size);
	    int numberToSearch=7;
	    int[] myArray2= {1,3,5,7,9,10};
	    boolean res=DivyaArrayUtil.binarSearch(myArray2,numberToSearch);
	    if(res)
	    {
	    	System.out.println("Element found");
	    }
	    else 
	    {
	    	System.out.println("Element not found");
	    }

	}
	int[] myArray3= {1,3,5,7,9};
	DivyaArrayUtil.myArrayReverse(myArray3);
	

}
