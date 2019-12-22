package day_19;
import java.util.Scanner;
public class SumAndAvg {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int start=0;

System.out.println("Enter n:");
int n=s.nextInt();

int total=((n*(n+1))/2);
int avg=total/n;
System.out.println("Sum:"+total);
System.out.println("Avg:"+avg);



	}

}
