package com.bayamp.training.stringutil.sandhya;

public class StringUtil {

	public static String reverse(String str) throws Exception {
		
		if (str == null)  {
			throw new Exception("String can not be null");
		}
		
		StringBuffer buff = new StringBuffer(str);
		return buff.reverse().toString();
	}
}
