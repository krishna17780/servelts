package Logicalprograms;

public class SumofDigts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=248;
     int sum=0;
       while(num>0) {
    	   int dgt= num%10;
    	    sum = sum+dgt;
    	   num=num/10;
       }
       System.out.println(sum);
	}

}
