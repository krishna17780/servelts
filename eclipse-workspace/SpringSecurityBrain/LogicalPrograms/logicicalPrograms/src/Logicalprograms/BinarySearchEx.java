package Logicalprograms;

public class BinarySearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean flag = false;
		int key = 8;
		int l = 0;
		int h = a.length - 1;
		int m = (l + h) / 2;
		while (l <= h) {
			if (a[m] < key) {
				l = m + 1;
			} else if (a[m] == key) {
				System.out.println("elemnt found..");
				break;
			} else {
				h = m - 1;
			}
			m = (l + h) / 2;
		}
		if (l > h) {
			System.out.println("elemt not found");
		}

	}

}
