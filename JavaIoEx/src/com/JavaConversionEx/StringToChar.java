package com.JavaConversionEx;

public class StringToChar {

	public static void main(String[] args) {
		String str = "welcome to Java";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}
