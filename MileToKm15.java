package dec_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MileToKm15 {

	public static void main(String[] args) throws Exception{
		//1 mile=1.6093km
		
		System.out.println("Enter Mile:");
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String input=bf.readLine();
		
		Double mile=Double.parseDouble(input);
		Double km=1.6093*mile;
		System.out.println("Km:"+km);
	}

}
