package javaEx;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		String str="welcome to java programming";
		//Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
		System.out.println(str1.length());
		
		System.out.println(str3.charAt(5));
		System.out.println(str1.indexOf("k"));
		System.out.println(str3.compareToIgnoreCase(str4));
		System.out.println(str3.contains(str4));
		System.out.println(str.replace("o", "ravi"));
		System.out.println(str1.replaceFirst("o", str3));

	}

}
