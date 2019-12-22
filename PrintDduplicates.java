package strings1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class PrintDduplicates {

	public static void main(String[] args) {
		String str="sandeep";
		

	}
	
	public static void displayDuplicates(String str){
		Map<Character,Integer> map=new HashMap<>();
		       char[] Characters= str.toCharArray();
		       
		       for(char c:Characters){
		    	   if (!map.containsKey(c)) {
					   map.put(c, 1);
				}else{
					map.put(c,map.get(c)+1 );
				}
		       }
		// Set<map.Entry<Character,Integer>>  set.Entry =map.setEntry();
		    	   
	}

}
