package Logicalprograms;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random rd = new Random();
		double db = rd.nextDouble();
		System.out.println(db);
		String str = rd.toString();
		System.out.println(str);
	}

}
