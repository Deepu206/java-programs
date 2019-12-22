package strings1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesDemo {

	public static void main(String[] args) {
      String str="sandeep";		
      System.out.println(removeDuplicats(str));
	}
public static String removeDuplicats(String str ){
	Set<Character>set=new HashSet<>();
	StringBuffer sb=new StringBuffer();
	
	for (int i = 0; i<str.length(); i++) {
		    Character  ch=str.charAt(i);
		if (!set.contains(ch)) {
			set.add(ch);
			sb.append(ch);
			
		}
		
	}
			
	return sb.toString();
}
}
