package javaPrograms;

public class StringEx {

	public static void main(String[] args) {
		String str = "welcome";
		System.out.println(str.hashCode());
		str = str + "java";
		System.out.println(str.hashCode());
		StringBuilder str1 = new StringBuilder("Java coding");
		System.out.println(str1.hashCode());
		str1.append("welcome");
		System.out.println(str1.hashCode());
		str1.append("Java");
		System.out.println(str1.hashCode());
	}

}
