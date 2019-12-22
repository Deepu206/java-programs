package day_19;
import java.util.Scanner;
public class CheckOddEvenEx_2p1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number...");
		int n=sc.nextInt();
		if (n%2==0) {
			System.out.println("EVEN");
		} else {
        System.out.println("ODD");
		}
System.out.println("BYE.....!");
	}

}
