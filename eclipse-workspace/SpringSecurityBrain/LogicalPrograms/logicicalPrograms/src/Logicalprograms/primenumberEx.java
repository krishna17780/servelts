package Logicalprograms;

import java.util.Scanner;

public class primenumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;

			}
			if (count == 0) {
				System.out.println("prime number");
			} else {
				System.out.println("not prime");
			}
		}

	}

}
