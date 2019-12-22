package nov_4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		
		String str="Deepu";
		System.out.println(RemoveDuplicates(str));

	}

	public static String RemoveDuplicates(String str){
		
		
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) {
				Character c=str.charAt(i);
				
				if (!set.contains(c)) {
					set.add(c);
					sf.append(c);
				}
		}
		
		return sf.toString();
	}
}

