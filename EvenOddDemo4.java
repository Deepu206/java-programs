package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenOddDemo4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		      //BufferedReader
		
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		Integer number=Integer.parseInt(br.readLine());
		
		if (number%2==0) {
			System.out.println("Even number");
		} else {
           System.out.println("Odd number");
		}*/
 
	         	//Scanner
		System.out.println("Enter number:");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int result=(number/2)*2;
		if (number==result) {
			System.out.println("Even number");
		} else {
            System.out.println("Odd number");
		}
		
		
	}

}
