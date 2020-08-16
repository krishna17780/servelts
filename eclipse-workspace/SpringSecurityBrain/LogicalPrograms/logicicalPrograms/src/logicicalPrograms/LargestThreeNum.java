package logicicalPrograms;

import java.util.Scanner;

public class LargestThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("enter num1 number: ");
         int num1= sc.nextInt();
         System.out.println("enter num2 number: ");
         int num2= sc.nextInt();
         System.out.println("enter num3 number: ");
         int num3= sc.nextInt();
         if (num1>num2 & num1>num3) {
        	 System.out.println("Num1 big");
			
		} 
         else if (num2>num3 & num2>num1) {
			System.out.println("num 2 big");
		}
         else {
        	 System.out.println("num3 big");
         }
	}

}
