package basics1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CircleAreaAndPerimeter_3 {

public static void main(String[] args) throws Exception {
	
BufferedReader br2=new BufferedReader(new InputStreamReader((System.in)));
System.out.println("Enter r for perimiter:");//perimiter=2*pi*r
String input2=br2.readLine();
double r2=Double.parseDouble(input2) ;
double pi=Math.PI;
double perimiter=2*pi*r2;
System.out.println("perimiter:"+perimiter);
	
BufferedReader br=new BufferedReader (new InputStreamReader((System.in))) ;
System.out.println("Enter r for area: ");//area=pi*r*r
String input1=br.readLine();

double r=Double.parseDouble(input1);
double Area=pi*r*r;
System.out.println("Area:"+Area);



}

}
