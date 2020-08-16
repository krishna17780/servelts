package javaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda8Ex {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(5);
		list.add(55);
		list.add(35);
		list.add(25);
		list.add(19);
		list.add(95);
		list.add(65);
		/*
		 * Collections.sort(list); System.out.println(list); Collections.reverse(list);
		 * System.out.println(list);
		 */
		list.stream().sorted().forEach(System.out::println);
	}

}
