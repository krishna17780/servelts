package Logicalprograms;

import java.util.Arrays;

public class ArraysEqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a1[]= {1,2,3,4,5,6,7};
            int a2[]= {1,2,3,4,6,7,5};
           boolean status=Arrays.equals(a1, a2);
           if (status==true) {
			System.out.println("equal");
		}else {
			System.out.println("not");
		}
            
	}

}
