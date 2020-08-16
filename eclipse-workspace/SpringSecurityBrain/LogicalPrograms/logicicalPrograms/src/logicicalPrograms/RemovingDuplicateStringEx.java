package logicicalPrograms;

import java.util.LinkedHashSet;

public class RemovingDuplicateStringEx {
	
	void removeDuplicates(String str) {
		LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}
			for (Character character : lhs) {
				System.out.println(character);
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="greek for greek";
      RemovingDuplicateStringEx r= new RemovingDuplicateStringEx();
      r.removeDuplicates(str);
      
	}

}
