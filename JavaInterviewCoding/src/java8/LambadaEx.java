package java8;

interface intr {
	public void m1();
}

public class LambadaEx {

	public static void main(String[] args) {
		intr i = () -> System.out.println("lambadas");
		i.m1();

	}

}
