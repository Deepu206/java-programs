package dec_26;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SylinderSurfaceAreaAndVolume {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter r:");
		String area=br.readLine();
		double r=Double.parseDouble(area);
		
		System.out.println("Enter height:");
		String height=br.readLine();
	    double h=Double.parseDouble(height);
	    

		double SurfaceArea=2*Math.PI*(r*r+h*r);
		System.out.println("SurfaceArea="+SurfaceArea);
		
		double volume=Math.PI*r*r*h;
		System.out.println("Volume:"+volume);
	}

}
