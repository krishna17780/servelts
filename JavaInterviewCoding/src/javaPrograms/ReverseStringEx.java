package javaPrograms;

public class ReverseStringEx {

	public static void main(String[] args) {
		String str = "wel come java";
		String rev = " ";
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];

		}
		System.out.println(rev);
	}

}
