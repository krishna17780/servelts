package Logicalprograms;

public class removeJunkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="%&()#@%&(( krishna kanth gona 12345788";
		String s1=s.replaceAll("[^a-zA-Z0-9]", " ");
      System.out.println(s1);
	}

}
