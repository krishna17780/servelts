package javaPrograms;

public class ReverseToggleEx {
	public static String reverseToggle(String str) {
		String words[] = str.split("\\s");
		String reverseToggle = "";
		for (String w : words) {
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			String first = sb.substring(0, 1);
			String lastString = sb.substring(1);
			reverseToggle += first.toUpperCase() + lastString.toLowerCase() + " ";

		}

		return reverseToggle.trim();

	}

	public static void main(String[] args) {
		System.out.println(ReverseToggleEx.reverseToggle("wel come java"));
	}

}
