package numbers;

import java.util.Scanner;

public class AreaAndCircumfranceOfCircle1 {

	public static void main(String[] args) {          
		     
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter r value:");
		
		double r=sc.nextInt();
		
		double Area=Math.PI*(r*r);                                       //area=Pi*r*r
		System.out.println("Area of circle:"+Area);
		
		double circumfrance=2*(Math.PI)*r;                  	         //circumfrance=2*pi*r
		System.out.println("Circumfrance of circle:"+circumfrance);
		
		
	}

}
