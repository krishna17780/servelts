package javaPrograms;

public class CharAtEx {
	public static void main(String[] args) {
		/*
		 * String s1 = "welcome java"; System.out.println(s1.hashCode()); s1 =
		 * s1.concat("code"); System.out.println(s1.hashCode());
		 */
		StringBuffer sbs = new StringBuffer("welcome");
		System.out.println(sbs.hashCode());
		sbs.append(" java");
		System.out.println(sbs.hashCode());
	}

}
