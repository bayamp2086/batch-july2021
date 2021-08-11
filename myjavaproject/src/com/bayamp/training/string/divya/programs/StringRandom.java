package com.bayamp.training.string.divya.programs;
import com.bayamp.training.utils.DivyaRandomUtils;

public class StringRandom {
	public static void main(String[] args)
	{
		String result=DivyaRandomUtils.getRandomNumber(8);
		System.out.println(result);
		
		String resultAlphanumeric=DivyaRandomUtils.getRandomNumberAlphanumeric(8);
		System.out.println(resultAlphanumeric);
	}

}
