package com.collection;

import java.util.HashMap;
import java.util.Map;

class BookExample {
	int id;
	String name, author, publisher;
	int quantity;

	public BookExample(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<Integer, BookExample> map = new HashMap<Integer, BookExample>();
		BookExample b1 = new BookExample(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookExample b2 = new BookExample(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookExample b3 = new BookExample(103, "Operating System", "Galvin", "Wiley", 6);
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		for (Map.Entry mp : map.entrySet()) {
			int key = (int) mp.getKey();
			BookExample be = (BookExample) mp.getValue();
			System.out.println(key+" "+be.author);

		}

	}

}
