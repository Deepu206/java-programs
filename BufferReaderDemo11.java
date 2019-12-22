package dec_24;//P-11

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo11 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name is");
		
		String data=br.readLine();
		System.out.println("My fnd name is "+data);
	}

}
