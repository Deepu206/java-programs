package dec_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FahrenheitToCelsius16 {

	public static void main(String[] args) throws Exception{
		
		// C=(F-32)*(5/9);
		
		System.out.println("Enter F:");
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String input=bf.readLine();
		
		double fahrenheit=Double.parseDouble(input);
		double celsius=(fahrenheit-32)*(5/9);
		System.out.println("Celcius:"+celsius);
	
	}

}
