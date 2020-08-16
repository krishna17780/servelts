package logicicalPrograms;

import java.util.Scanner;

public class EvenNumberPrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ente a number: ");
		int num = sc.nextInt();
		for (int i = 0; i <=num; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}

}
