package logicicalPrograms;

public class FirstDuplicatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2,89, 3, 5, 6, 5,6, 7, 7, 8, 8, 89, 9, 9, 8, 3 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
                 return;
				}

			}

		}
	}
}
