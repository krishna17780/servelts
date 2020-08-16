package com.collection;

import java.util.HashSet;

class BookEx {
	int id;
	String name, author, publisher;
	int quantity;

	public BookEx(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class HashsetyEx {

	public static void main(String[] args) {
		HashSet<BookEx> hs = new HashSet<BookEx>();
		BookEx b1 = new BookEx(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookEx b2 = new BookEx(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookEx b3 = new BookEx(103, "Operating System", "Galvin", "Wiley", 6);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		// Traversing hash table
		for (BookEx b : hs) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
