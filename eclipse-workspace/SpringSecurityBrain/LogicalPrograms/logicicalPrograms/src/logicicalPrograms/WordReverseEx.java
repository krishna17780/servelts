package logicicalPrograms;

public class WordReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wel come to java";
		String splitArray[] = str.split(" ");
		for (int i = splitArray.length - 1; i >= 0; i--) {
			System.out.println(splitArray[i]);
		}
	}

}
