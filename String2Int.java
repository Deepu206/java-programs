package p1;

public class String2Int {

	public static void main(String[] args) {
		
		String str="4";
	int	a=Integer.parseInt(str);
		System.out.println(a);
		
		/*String str1="4s";
		int b=Integer.parseInt(str1);
		System.out.println(b);*/
	}

}
/*parseInt() will convert string “4” to integer
In order to use Integer.parseInt() method, we should pass string having numbers only.
If input string contains other than numbers parseInt() function will throw java.lang.NumberFormatException.*/