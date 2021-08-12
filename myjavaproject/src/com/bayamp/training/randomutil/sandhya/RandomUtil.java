package com.bayamp.training.randomutil.sandhya;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomUtil {

	/*
	 * public static void randomNumber(int howMany) throws InterruptedException {
	 * for (int i = 0; i < howMany; i++) { long randomNumber =
	 * System.currentTimeMillis();
	 * System.out.println("The Random Number generated is :" + randomNumber);
	 * 
	 * Thread.sleep(1000);
	 * 
	 * } }
	 */

	/*
	 * public static void randomAlphaNumeric(int howMany) throws char[]
	 * alphabetlowercase = InterruptedException { for( int i =0; i< howMany; i++) {
	 * long randomAlphaNumeric = System.;
	 * System.out.println("The Random Number generated is :" + randomAlphaNumeric);
	 * 
	 * Thread.sleep(1000); } }
	 */

	public static void randomNumbers(int num) {
		IntStream generatedNums = null;
		Random randomNum = new Random();
		for(int i=0;i<num;i++) {
			generatedNums= randomNum.ints(num);
		}
		generatedNums.forEach(nums -> System.out.println(nums));
	}

}
