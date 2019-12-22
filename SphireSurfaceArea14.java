package dec_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SphireSurfaceArea14 {

	public static void main(String[] args) throws Exception{
		//sphire area=4*pi*r*r   volume=4/3*pi*r*r*r
		
		System.out.println("Enter r:");
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		Double r=Double.parseDouble(input);

		double surfaceArea=4*(Math.PI)*r*r;
		double volume=(4/3)*(Math.PI)*r*r*r;
		System.out.println("Surface Area:"+surfaceArea);
		System.out.println("Surface Volume:"+volume);
		
      
	}

}

