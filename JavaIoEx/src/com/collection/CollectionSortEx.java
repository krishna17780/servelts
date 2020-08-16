package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");
		Collections.sort(al, Comparator.reverseOrder());
		System.out.println(al);

	}

}
