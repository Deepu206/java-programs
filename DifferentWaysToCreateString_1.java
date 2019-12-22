package strings1;

public class DifferentWaysToCreateString_1 {

	public static void main(String[] args) {
		String s1="HelloWorld";
		String s2="HelloWorld";
		//System.out.println(s1==s2); 
		
		String s3=new String("HelloWorld");
		String s4=new String("HelloWorld");
		//System.out.println(s3==s4);
		
		//System.out.println(s1.equals(s3));
		
		   //cha arr[]
		char arr[]={'a','b','c'};
		String s5=new String(arr ,0,1);  
		//System.out.println(s5);
		
		   //byte buf[]
		byte buf[]={65,66,67,68,69};
		String s6=new String(buf,0,2); 
		System.out.println(s6);
	}

}
