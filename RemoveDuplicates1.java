package nov_4;

import java.util.HashSet;
import java.util.*;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		
		String str="sandeep";                        //Initializing string
		System.out.println(RemoveDuplicates(str));   //sandep

	}
	
   public static String RemoveDuplicates(String str){
	
	Set<Character> set=new HashSet<Character>();     //hashset wont allow duplicates so we are taking hashset here
	StringBuffer sf=new StringBuffer();              //stringBuffer is mutable(we can made any changes once the object created)
	
	for (int i = 0; i < str.length(); i++) {	    //loop through the each character in the arry
	Character c=str.charAt(i);	                    //extract each character from the string....str.charAt(0)->s
	
	if (!set.contains(c)) {                        //if 's' is not present in hashset 
		set.add(c);                                //add str to the stringBuffer
		sf.append(c);                              //s
	}
	}
	return sf.toString();
	
}
}
