package dec_25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateBonusForEmployee {

	public static void main(String[] args)  throws Exception{
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		   System.out.println("Enter sal:"); 
		   String input1=br.readLine();
		   double sal=Double.parseDouble(input1);
			   
		   
		   System.out.println("Enter Bonus:");
		   String input2=br.readLine();
		   double bonus=Double.parseDouble(input2);
		   
		   double total=sal+(bonus/100)*sal;
		   System.out.println("Total="+total);
		   
   
            	 
	}

}
