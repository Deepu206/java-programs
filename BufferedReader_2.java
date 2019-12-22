package basics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_2 {

	
	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader( (new InputStreamReader((System.in))));
	System.out.println("Enter your name is");
	String data=br.readLine();
	System.out.println("Enter your name is "+data);
	

	}

}

