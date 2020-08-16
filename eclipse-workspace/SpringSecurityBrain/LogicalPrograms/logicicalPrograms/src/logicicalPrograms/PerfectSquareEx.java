package logicicalPrograms;

import java.util.Scanner;

public class PerfectSquareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num ");
		int num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			if (i * i == num) {
				System.out.println("given number is square of " + i);
				return;
			}
		}

	}

}
