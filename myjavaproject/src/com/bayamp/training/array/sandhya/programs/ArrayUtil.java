package com.bayamp.training.array.sandhya.programs;

public class ArrayUtil {

	public static boolean linearSearch(int[] givenArray, int searchNum) {
		boolean foundNum = false;
		for (int i = 0; i < givenArray.length; i++) {
			if (searchNum == givenArray[i]) {
				foundNum = true;
			}
		}
		return foundNum;
	}

	public static boolean binarySearch(int[] currentArray, int numToBeSearched) {
		boolean numInArray = false;
		int newArrayElement;
		int length = currentArray.length;
		for (int elements = 0; elements < currentArray.length; elements++) {
			for (int otherElement = elements + 1; otherElement < currentArray.length; otherElement++) {
				if (currentArray[elements] > currentArray[otherElement]) {
					newArrayElement = currentArray[elements];
					currentArray[elements] = currentArray[otherElement];
					currentArray[otherElement] = newArrayElement;
				}
			}
		}

		if (currentArray[length / 2] > numToBeSearched) {
			for (int j = 0; j < length / 2; j++) {
				if (numToBeSearched == currentArray[j]) {
					numInArray = true;
				}
			}

		} else {
			for (int j = length / 2; j < length; j++) {
				if (numToBeSearched == currentArray[j]) {
					numInArray = true;
				}
			}
		}
		return numInArray;
	}

}
