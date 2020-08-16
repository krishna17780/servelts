import java.util.Scanner;

public class TestEx {
	interface Arithmetic{
		int operation(int a, int b);
	}

	public static void main(String[] args) {
	      Arithmetic addition = (a,b)->(a+b);
	      System.out.println(addition.operation(10, 15));
	      Arithmetic sub = (a,b)->(a-b);
	      System.out.println(sub.operation(10, 15));
	      Arithmetic mul = (a,b)->(a*b);
	      System.out.println(mul.operation(10, 15));
	      Arithmetic div = (a,b)->(a/b);
	      System.out.println(div.operation(20, 10));
}
	}