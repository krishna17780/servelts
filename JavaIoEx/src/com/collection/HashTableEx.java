package com.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashTableEx {

	public static void main(String[] args) {
		
		Map<Integer, BookExa> ma = new Hashtable<Integer, BookExa>();
		BookExa b1 = new BookExa(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookExa b2 = new BookExa(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookExa b3 = new BookExa(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to map
		ma.put(1, b1);
		ma.put(2, b2);
		ma.put(3, b3);
		
	}

}
