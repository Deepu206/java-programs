package day_19;
import java.util.Scanner;
public class PrintDayInWordEx1_2p1 {

	public static void main(String[] args) {
		
		//nested if
/*int n=7;
if (n==1) {
	System.out.println("SUNDAY");
} else if (n==2) {
	System.out.println("MONDAY");
}else if (n==3) {
	System.out.println("TUESDAY");
}else if (n==4) {
	System.out.println("WEDNESDAY");
}else if (n==5) {
	System.out.println("THURSDAY");
}else if (n==6) {
	System.out.println("FRIDAY");
}else if (n==7) {
	System.out.println("SARTARDAY");
}else {
System.out.println("Not a valid day");
}
System.out.println("Bye.....!");*/
		
		//switch case
		
		/*int n;
		switch (n=8) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;

		default:
			System.out.println("Not a valid day");
			break;
		}
		System.out.println("BYS....!");*/
		
		//scanner
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int n=sc.nextInt();
		if (n==1) {
			System.out.println("SUNDAY");	
		}else if (n==2) {
			System.out.println("MONDAY");
		}else if (n==3) {
			System.out.println("TUESDAY");
		} else if (n==4) {
			System.out.println("WEDNESDAY");
		}else if (n==5) {
			System.out.println("THURSDAY");
		}else if (n==6) {
			System.out.println("FRIDAY");
		}else if (n==7) {
			System.out.println("SARTARDAY");
		}else {
            System.out.println("Not a valid day");
		}	
		System.out.println("Bye...!");*/
		
		//Switch case
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int n=sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SARTARDAY");
			break;

		default:
			System.out.println("Not a valid day");
			break;
		}
		System.out.println("Bye.....!");
	}

}

