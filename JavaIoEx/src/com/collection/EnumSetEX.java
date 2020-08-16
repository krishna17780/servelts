package com.collection;

import java.util.EnumSet;
import java.util.Set;

enum Days {
	Monday, tuesday, wednesday, Thursaday, friday, saturday, sunday;
}

public class EnumSetEX {

	public static void main(String[] args) {
		Set<Days> set = EnumSet.of(Days.sunday, Days.saturday);
		for (Days days : set) {
			System.out.println(days);
		}
	}

}
