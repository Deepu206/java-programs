package basics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SphereAreaAndVolume_4 {	
	public static void main(String[] args) throws Exception{
		
		/*sphere area=4*pi*r*r*/
		
	BufferedReader br1=(new BufferedReader(new InputStreamReader(System.in)));
	System.out.println("Enter r1");
	String input1=br1.readLine();
	double pi=Math.PI;
	double r=Double.parseDouble(input1);
	double area=4*pi*r*r;
	System.out.println("Area="+area);
	
	/*sphere volume=(4/3)*pi*r*r*r;*/
	
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter r2");
	String input2=br2.readLine();
	double r2=Double.parseDouble(input2); 
	double volume=(4/3)*pi*r*r*r;
	System.out.println("Volume="+volume);
	}

}
