package com.collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add("krishna");
		v.add("kanth");
		v.add("ravi");
		v.add("gopi");
		for (Object object : v) {
			System.out.println(object);
		}
	}

}
