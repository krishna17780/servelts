package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, BookExa> map = new TreeMap<>();
		BookExa b1 = new BookExa(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookExa b2 = new BookExa(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookExa b3 = new BookExa(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding BookExas to map
		map.put(2, b2);
		map.put(1, b1);
		map.put(3, b3);
		for (Map.Entry ma : map.entrySet()) {
			
			BookExa be= (BookExa) ma.getValue();
		 System.out.println(be.name+" Key" +ma.getKey());
		}
	}

}
