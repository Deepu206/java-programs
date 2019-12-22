package patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle1 {

public static void main(String[] args) throws Exception  {
		
BufferedReader br=	new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size");
int size=Integer.parseInt(br.readLine());

		for(int i=1;i<=size;i++){
			System.out.print("*");
		}
		System.out.println();
		
		for (int j = 1; j <=size-2; j++) {
			for (int i=1;i<=size;i++){
				if (i==1 ||i==size) {
					System.out.print("*");
				} else {
	                System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=size;i++){
			System.out.print("*");
		}
		
	}

}
