package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraylistExp {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  Collections.sort(al);
		  System.out.println(al);
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al.retainAll(al2);  
		  System.out.println(al);
	}

}
