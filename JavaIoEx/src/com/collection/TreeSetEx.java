package com.collection;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("krishna");
		ts.add("kanth");
		ts.add("ravi");
		ts.add("sai");
		for (Object object : ts) {
			System.out.println(object);
		}
	}

}