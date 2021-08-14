package com.bayamp.training.utils;

import java.math.BigInteger;

public class LovelyMathUtil {

	public static boolean isPrimeNumber(int number) {
		if (number == 0) 
			return false;
		

		if (number % 2 == 0) {
			//System.out.println("Number is not a prime number");
			return false;
		}
		int remainder;
		for (int i = 2; i < number; i++) {
			remainder = number % i;
			if (remainder == 0) {
				//System.out.println("Number is not a prime number");
				return false;
			}

		}
		//System.out.println(String.valueOf(number) + " is a prime number");
		return true;

	}

	public static boolean isOddNumber(int number)
	{
		if (number % 2 != 0) 			
			return true;
		 else
			return false;
		
	}

	public static int[] swapNumbers(int[] args) {
		int[] swappedNos = new int[args.length];
		int j = 0;
		for (int i = args.length - 1; i >= 0; i--)
		{
			swappedNos[j] = args[i];
			j++;
		}
		return swappedNos;
	}

	public static int[] swapNumbersWithTemp(int[] args) {
		int temp;

		for (int i = 0; i < args.length - 1; i++) {
			temp = args[i];
			args[i] = args[i + 1];
			args[i + 1] = temp;
		}
		return args;

	}

	public static BigInteger calculateFactorial(int number) {
		BigInteger temp = new BigInteger(String.valueOf(number));
		BigInteger x;
		for (int i = number; i > 2; i--) {
			x = new BigInteger(String.valueOf((i - 1)));
			temp = temp.multiply(x);
		}
		return temp;
	}

	public static long multiplyNumbers(int[] nonFraction) {
		long temp = 1;
		for (int arg : nonFraction) {
			temp = temp * arg;
		}
		return (long) temp;
	}

	public static double multiplyNumbers(double[] nonFraction) {
		double temp = 1;
		for (double arg : nonFraction) {
			temp = temp * arg;
		}
		return temp;
	}
	
	public static int getRandomNumber() {
		//random
		return 0;
	}

}
