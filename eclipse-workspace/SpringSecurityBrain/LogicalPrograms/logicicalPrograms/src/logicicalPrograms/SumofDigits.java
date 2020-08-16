package logicicalPrograms;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=123;
       int rev=0;
       int sum=0;
       while(num>0) {
    	   rev=num%10;
    	   sum=sum+rev;
    	   num=num/10;
       }System.out.println(sum);
	}

}
