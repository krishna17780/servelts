package logicicalPrograms;

import java.util.Scanner;

public class SumfirstlastDigitEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int lstdgt=num%10;
		int fstdgt=num;
		while (fstdgt>=10) {
			fstdgt=fstdgt/10;
		}
		System.out.println(fstdgt+lstdgt);

	}

}
