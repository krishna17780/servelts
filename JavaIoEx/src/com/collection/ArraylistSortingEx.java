package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistSortingEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");
		list.add(null);
		list.add("Vijay");
		list.add("");
		list.add("Ravi");
		list.add("");
		list.add("Ajay");
		list.add(null);
		System.out.println(list);
		ListIterator<String> ll = list.listIterator(list.size());
		while (ll.hasPrevious()) {
			String string = (String) ll.previous();
			System.out.println(string);
		}
	}

}
