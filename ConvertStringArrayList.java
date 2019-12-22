package p1;

import java.util.Arrays;
import java.util.List;
                                                  //Convert String Array to List 
                                                  //Syntax:Arrays.asList(“Input String array“);
public class ConvertStringArrayList {

	public static void main(String[] args) {
		
		String[] str={"Divya","Deepu"};
		List<String>list=Arrays.asList(str);
        System.out.println(list);
	}

}
