package javaPrograms;

public class StringBufferEx {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer str = new StringBuffer("welcome");
		for (int i = 0; i < 10000; i++) {
			str.append("to java");
		}
		System.out.println("stringbuffer " + (System.currentTimeMillis() - startTime));

		StringBuilder str1 = new StringBuilder("welcome");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str1.append("to java");
		}
		System.out.println("stringbuilder " + (System.currentTimeMillis() - startTime));
	}
}
