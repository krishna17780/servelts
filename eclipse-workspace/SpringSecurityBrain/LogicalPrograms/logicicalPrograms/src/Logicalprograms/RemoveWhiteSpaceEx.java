package Logicalprograms;

public class RemoveWhiteSpaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "krishna   kanth    gona";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
