package dec_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CircleAreaAndPerimeter13 {

	public static void main(String[] args) throws Exception{
		
		// perimeter=2*pi*r  Area=pi*r*r
		
		System.out.println("Enter r:");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String input=bf.readLine();
		Double r=Double.parseDouble(input);
		        
		double pi=(Math.PI);
		double peri=2*pi*r;
		double area=pi*r*r;
		System.out.println("perimeter:"+peri);
		System.out.println("Area:"+area);
	
	}

} 

