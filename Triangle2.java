package patterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle2 {

 public static void main(String[] args) throws Exception {
 BufferedReader br=new BufferedReader (new InputStreamReader((System.in)));
 System.out.println("Enter size");
 int size=Integer.parseInt((br.readLine()));
 
 for (int i = 1; i <=size; i++) {
	for (int j = size; j >=1; j--) {
		if (j>i) {
			System.out.print(" ");
		} else {
            System.out.print("*");
		}
	}
	System.out.println();
}
}
}