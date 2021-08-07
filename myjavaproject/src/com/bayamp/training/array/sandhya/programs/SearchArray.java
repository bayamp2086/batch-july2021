package com.bayamp.training.array.sandhya.programs;

import com.bayamp.training.utils.ArrayUtil;

public class SearchArray {

	public static void main(String[] args) {
		int[] myArray = {30,10,222,33,12,10,9,8};

		int numberToSearch = 102;

		boolean result1 = ArrayUtil.linearSearch(myArray,102);

		//LINEAR SEARCH
		//BINARY SEARCH( THIS WAS ASKED TO ME ATLEAST 3 TIMES )

		if(result1) {
			System.out.println("The number "+ numberToSearch+" is present");

		}else {
			System.out.println("The number "+ numberToSearch+" is not present");
		}
		numberToSearch = 30;

		boolean result2 = ArrayUtil.binarySearch(myArray,30);

		if(result2) {
			System.out.println("The number "+ numberToSearch+" is present");

		}else {
			System.out.println("The number "+ numberToSearch+" is not present");
		}

	}

}
