package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("krishna");
		al.add("kanth");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------------------");
		for (String string : al) {
			System.out.println(string);
		}
		System.out.println(al.get(1));

	}

}
