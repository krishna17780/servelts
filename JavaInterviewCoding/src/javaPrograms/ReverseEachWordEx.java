package javaPrograms;

public class ReverseEachWordEx {
	public static String reversString(String str) {
		String words[] = str.split("\\s");
		String reversString = "";
		for (String w : words) {
			StringBuffer st= new StringBuffer(w);
			st.reverse();
			reversString+=st.toString()+" ";
		}
		return reversString.trim();

	}

	public static void main(String[] args) {
		System.out.println(ReverseEachWordEx.reversString("wel come java"));

	}

}
