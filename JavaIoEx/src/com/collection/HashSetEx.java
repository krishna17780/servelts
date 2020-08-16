package com.collection;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("");
		set.add("Three");
		set.add("Four");
		set.add(null);
		set.add("Five");
		set.add("Two");
		set.add(null);
		set.add("");
		for (String str : set) {
			System.out.println(str);
		}

	}

}
