package javaPrograms;

public class Calculator {
	static int cube(int n) {
		return n * n * n;
	}

	public static void main(String[] args) {
      int result=Calculator.cube(5);
      System.out.println(result);
	}

}
