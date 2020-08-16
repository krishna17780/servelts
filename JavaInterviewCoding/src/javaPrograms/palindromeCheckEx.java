package javaPrograms;

public class palindromeCheckEx {
	public static String isPlandrem(String str) {
		StringBuilder st = new StringBuilder(str);
		st.reverse();
		String rev = st.toString();
		if (str.equalsIgnoreCase(rev)) {
			return "Both are equal";
		}
		return "both not equal";

	}

	public static void main(String[] args) {
		System.out.println(isPlandrem("welew"));

	}

}
