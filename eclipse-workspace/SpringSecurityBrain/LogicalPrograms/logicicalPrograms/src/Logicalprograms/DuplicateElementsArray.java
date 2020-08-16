package Logicalprograms;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "java", "c", "c++", "python", "java", "c" };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) == true) {
					System.out.println(arr[i]);
					flag = true;
				}
			}
		}
	}

}
