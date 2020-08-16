package com.collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Object> v = new Stack<Object>();
		v.push("krishna");
		v.push("kanth");
		v.push("ravi");
		v.push("gopi");
		v.pop();
		for (Object object : v) {
			System.out.println(object);
		}
	}

}
