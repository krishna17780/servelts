package logicicalPrograms;

import java.util.Scanner;

public class RevNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ente a number: ");
		int num = sc.nextInt();
		int rev = 0;
		int sum = 0;
		while (num > 0) {
			rev = num % 10;
			sum = sum * 10 + rev;
			System.out.println(sum);
			num = num / 10;
		}
		System.out.println(sum);

	}

}
