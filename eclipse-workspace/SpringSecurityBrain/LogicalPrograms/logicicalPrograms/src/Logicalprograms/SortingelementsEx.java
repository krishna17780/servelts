package Logicalprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingelementsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 3, 4, 57, 8, 32 };
		System.out.println("Before sorting " + Arrays.toString(a));
	   Arrays.parallelSort(a);
	   System.out.println("after sorting"+Arrays.toString(a));
	   
		Integer a1[] = { 10, 3, 6, 4, 57, 8, 32 };
         
		Arrays.sort(a1, Collections.reverseOrder());
		   System.out.println("after sorting"+Arrays.toString(a1));

	   
	}

}
