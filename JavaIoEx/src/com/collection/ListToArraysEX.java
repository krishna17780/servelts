package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArraysEX {

	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		Object[] object = fruitList.toArray();
		for (Object obj : object) {
			System.out.println(obj);
		}

		String[] array = fruitList.toArray(new String[fruitList.size()]);
		System.out.println(Arrays.toString(array));

	}

}
