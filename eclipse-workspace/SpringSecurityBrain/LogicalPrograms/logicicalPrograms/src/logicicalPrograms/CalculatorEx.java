package logicicalPrograms;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
        System.out.println("enter an operator perform Operations: ");
        char op=sc.next().charAt(0);
        
        double o=0;
        
        switch (op) {
		case '+':
			o=num1+num2;
			break;
		case '-':
			o=num1-num2;
			break;
		case '/':
			o=num1/num2;
			break;
		case '%':
			o=num1%num2;
			break;
		default:
			System.out.println("you have entered wrong operator: ");
			break;
		}
        System.out.println(num1+" "+op+" " +num2+ " ="+o);
        
	}

}
