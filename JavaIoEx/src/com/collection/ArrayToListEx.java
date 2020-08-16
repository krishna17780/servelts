package com.collection;

import java.util.ArrayList;

public class ArrayToListEx {

	public static void main(String[] args) {
		String[] array = { "java", "c", "PHP", "Python" };
		ArrayList al = new ArrayList<>();
		for (Object object : array) {
			al.add(object);
		}
		System.out.println(al);
	}

}
