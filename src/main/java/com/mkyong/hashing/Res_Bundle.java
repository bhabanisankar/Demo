package com.mkyong.hashing;

import java.util.ResourceBundle;

public class Res_Bundle {
	
	public static String getBundle(String key) {
		final String s1="global";
		ResourceBundle rs = ResourceBundle.getBundle(s1);
		return rs.getString(key);
		
	}

}
