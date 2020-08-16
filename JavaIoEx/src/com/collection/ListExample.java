package com.collection;

import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quality;

	public Book(int id, String name, String author, String publisher, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quality = quality;
	}

}

public class ListExample {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		list.add(b1);
		list.add(b2);
		list.add(b3);

		for (Book book : list) {
			System.out.println(book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quality);
		}
	}

}
