package logicicalPrograms;

import java.util.Scanner;

public class PlayTriangelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n, num=1;
         Scanner sc = new Scanner(System.in);
         n=sc.nextInt();
         System.out.println("enter num: ");
         for (int i = 1; i <=n; i++) {
        	 for (int j = 1; j <=i; j++) {
				System.out.print(num+" ");
				num++;
			}
        	 System.out.println(" ");
			
		}
         
	}

}
