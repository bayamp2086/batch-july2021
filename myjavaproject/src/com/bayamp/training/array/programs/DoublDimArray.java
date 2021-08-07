package com.bayamp.training.array.programs;

public class DoublDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] infantAges = {0,1,2,3,4,5};
		int[] toddlerAges = {6,7,8,9,10,11,12};
		int[] teenAges = {13,14,15,16,17,18,19};
		
		System.out.println("The third toddler age is :" + toddlerAges[2]);
		
		int[][] allAges = {infantAges ,toddlerAges ,  teenAges};
		
		System.out.println("The fourh teenage is :" + allAges[2][3]);
		
		String topCompany1 = "bayamp technologies";
		String topCompany2 = "apple";
		String topCompany3 = "google";
		String topCompany4 = "facebook";
		
		
		String[] top5Companies = { topCompany1,topCompany3,topCompany2,topCompany4};
		
		
		String bottomCompany1 = "ibm";
		String bottomCompany2 = "hp";
		
		String[] bottomCompanies = {bottomCompany1,bottomCompany2};
		
		Object[][] allCompanies = { top5Companies,bottomCompanies } ;
		
		System.out.println(allCompanies[0][2]);
		
		
		//
		//String inputStr = "one two three four";
		//outStr = three four one two
		
		
		//String , StringBuffer, StringBuilder, StringFormat, StringTokenizer 
		
		
		String[] foodItems = {"idli","wada","dosa","uttapam"};
		
		//sort the String[] array 
		
		
	}

}
