package javaPrograms;

import java.util.function.Function;

public class StaticEx {
	
	
	static int count = 0;

	StaticEx() {
		count++;
		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx st1 = new StaticEx();
		StaticEx st2 = new StaticEx();
		StaticEx st3 = new StaticEx();
		StaticEx st = new StaticEx();

	}

}
