package p1;

import java.io.*;
import java.util.*;



public class ReverseAString1 {

	//Pseudo Code for Reverse String Method 1:
	 public static void main(String[] args) {
	        String input="";
	        System.out.println("Enter the input string");
	        try
	        {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            input = br.readLine();
	            char[] try1= input.toCharArray();
	            for (int i=try1.length-1;i>=0;i--)
	            System.out.print(try1[i]);
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}


