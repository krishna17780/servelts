package logicicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "krishna kanth";
		System.out.println(recursiveString(s));
	}

	private static String recursiveString(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		return recursiveString(s.substring(1)) + s.charAt(0);
	}

}
