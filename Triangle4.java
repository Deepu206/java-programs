package patterns;

/*import java.io.BufferedReader;
import java.io.InputStreamReader;*/

public class Triangle4 {

	public static void main(String[] args) throws Exception  {
	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter size");
     int size=Integer.parseInt((br.readLine()));*/
     
     for (int i = 1; i <=5; i++) {
    	 for (int j = 1; j <=5; j++) {
    		 if (j<i) {
				System.out.print("");
			} else {
				System.out.print("*");
			}
        	 
    	} 
    	 System.out.println(" "); 
	}
     
     
	}

}
