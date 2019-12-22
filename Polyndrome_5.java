package strings1;


public class Polyndrome_5 {

	public static void main(String[] args) throws Exception {
	
	    String  s1="abcba";
		StringBuffer  sb=new StringBuffer(s1);
		sb.reverse();
		String s2=sb.toString();
		System.out.println(sb);
		if (s1.equals(s2)) {
			System.out.println("polynrome");
		} else {
            System.out.println("not polyndrome "); 
		} 
		
		
		
		

	}

}
