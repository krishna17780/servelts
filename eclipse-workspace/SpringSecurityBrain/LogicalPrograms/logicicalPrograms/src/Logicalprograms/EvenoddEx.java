package Logicalprograms;

public class EvenoddEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] %2 == 0) {
				System.out.println(a[i]);
				even++;
			} else {
				odd++;
			}

		}
		System.out.println(even);
		System.out.println(odd);
	}

}
