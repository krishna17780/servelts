package logicicalPrograms;

import java.util.Scanner;

public class EvenOddCountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0)
				even++;
			else
				odd++;
			num = num / 10;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
