package basics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CylinderAreaAndVolume_5 {

	public static void main(String[] args) throws Exception{
	double pi=Math.PI;	
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter r");
	String input1= br1.readLine();
    double r=Double.parseDouble(input1);
    System.out.println("Enter h");
    String input2= br1.readLine();
	double h= Double.parseDouble(input2);
	double area=(2*(pi)*r*(r+h));
	System.out.println("Sphere Area="+area);
	
	double volume=(pi)*r*r*h;
	System.out.println("sphere volue="+volume);
	
	}

}
