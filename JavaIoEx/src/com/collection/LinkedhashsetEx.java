package com.collection;

import java.util.LinkedHashSet;

public class LinkedhashsetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
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
