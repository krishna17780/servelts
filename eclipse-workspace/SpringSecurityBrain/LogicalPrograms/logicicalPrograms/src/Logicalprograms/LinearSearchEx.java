package Logicalprograms;

import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 34, 5, 66, 34, 7, 88, 84 };
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num: ");
		int lin = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == lin) {
				System.out.println("Element Found" + a[i]);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("element not found");
		}

	}

}
