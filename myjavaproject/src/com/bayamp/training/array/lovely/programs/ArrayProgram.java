package com.bayamp.training.array.lovely.programs;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import com.bayamp.training.utils.LovelyArrayUtil;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
	  
		Instant start = Instant.now();
		 
		String[] ccountries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.sort(ccountries)));
		Instant finish = Instant.now();  
		long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println(timeElapsed);
		
		start = Instant.now();  
		String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.arrSort(countries)));
		finish = Instant.now();
		timeElapsed = Duration.between(start, finish).toMillis();  //in millis
		System.out.println(timeElapsed);
		
		
		
		String[] arrString = {"Reetha","Lovely","Simly","swara","Arjun","Arkush",
				"Arush","Anousha","America","Australia","Lively","Lonely","Lovsy"};
		System.out.println(LovelyArrayUtil.toString(LovelyArrayUtil.sort(arrString)));
		
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
	

}
