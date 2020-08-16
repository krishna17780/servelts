package Logicalprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMaxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(18, 2, 3, 3, 44, 55, 5, 6, 77, 8, 15);
		int min = Collections.min(list);
		System.out.println(min);
		int max = Collections.max(list);
		System.out.println(max);

		int[] largestArray = { 4, 8, 34, 5, 6, 64, 4, 17, 4, 11, 3, 4, 3 };
		int smallest = largestArray[0];
		int largest = largestArray[0];
		for (int i = 0; i < largestArray.length; i++) {
			if (largestArray[i] < smallest)
				smallest = largestArray[i];
			if (largestArray[i] > largest)
				largest = largestArray[i];
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}
