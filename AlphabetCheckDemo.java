package strings1;


import java.util.Scanner;

public class AlphabetCheckDemo {
 
	public static void main(String[] args) throws Exception {
		System.out.println("Enter character");
		Scanner sc=new Scanner(System.in);
		     char ch=sc.next().charAt(0);
           if ((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z')) {
			System.out.println("Alphabet");
		} else {
           System.out.println("Not Alphabet");
		}            
	}

}
