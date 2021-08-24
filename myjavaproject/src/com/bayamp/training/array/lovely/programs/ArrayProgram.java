package com.bayamp.training.array.lovely.programs;

import java.util.Random;

import com.bayamp.training.userdefined.lovely.objects.Employee;
import com.bayamp.training.utils.LovelyArrayUtil;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
	createPrimitiveDataArray();
	createReferencetypeArray();
		
		int[] arr1 = {300,10,222,3300,5,-5,9,8,-3};		
		LovelyArrayUtil.breakContinueForLoop(arr1,3,1);
	  
		//Instant start = Instant.now();
		 
		String[] ccountries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.sort(ccountries)));
		//Instant finish = Instant.now();  
		//long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		//System.out.println(timeElapsed);
		
		//start = Instant.now();  
		String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.arrSort(countries)));
		//finish = Instant.now();
		//timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		//System.out.println(timeElapsed);
		
			
		
		String[] arrsString = {"zebra","monkey","aligator","mango","donkey","doggy","giraffe",
				"snake","tiger","lion","cat","sloth"};
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.sort(arrsString)));
		
		arrsString = new String []{"abc","acd","efg","def","xyz"};
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.sort(arrsString)));
		
		
		
		
		int[] arr = {300,10,222,3300,5,-5,9,8,-3};		
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.sort(arr)));
		boolean found = LovelyArrayUtil.linearSearch(arr, 9);
		if(found) {
			System.out.println("found");
		}
		else
			System.out.println("not found");
		
		found = LovelyArrayUtil.binarySearch(arr, -3);
		if(found) {
			System.out.println("found");
		}
		else
			System.out.println("not found");


	}
	
	private static void createPrimitiveDataArray() {
		
		Random r = new Random();
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = r.nextInt(100);
		}
		intArray[2] = 7;
		System.out.println(LovelyArrayUtil.toString(intArray));
		boolean result = LovelyArrayUtil.binarySearch(intArray, 7);
		if (result)
			System.out.println("Found!!");
		
	}
	
	
	private static void createReferencetypeArray()
	{
		Employee[] eArray = new Employee[4];
		Employee e1 = new Employee("sonia", "rane",34,"232-454-1234") ;
		eArray[0] = e1;
		e1 = new Employee("kartik", "iyer",35,"532-454-1234") ;
		eArray[1] = e1;
		e1 = new Employee("satvik", "iyer",36,"522-454-1234") ;
		eArray[2] = e1;
		e1 = new Employee("maryam", "iyer",37,"512-454-1234") ;
		eArray[3] = e1;
		Employee.sort(eArray);
		for (Employee employee : eArray) {
			System.out.println(employee);
		}		
		
	}
	

}
