package javaEx;

import java.util.ArrayList;
import java.util.List;

interface Drawable {
	void draw(String message);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaEx {
	public static void main(String[] args) {
		Drawable drawable = (message) -> System.out.println(message);
		drawable.draw("welcome draw:");
		Addable addable = (a, b) -> (a + b);
		System.out.println("addition: " + addable.add(10, 20));
		Addable subtraction = (a, b) -> (a - b);
		System.out.println("subtraction: " + subtraction.add(50, 10));

		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("c++");
		list.add("java");
		list.add("python");
		list.add("javascript");
		list.add("google");
		list.add("c");
		list.add("c++");
		list.stream().distinct().forEach(System.out::println);

	}

}
