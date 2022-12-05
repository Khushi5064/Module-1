package Module_2;

import java.util.ArrayList;
import java.util.List;

public class Que_45 {
	public static void main(String[] args) {
		  
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		  
		if (list_Strings.contains("Pink")) {
			System.out.println("Found the element");
		} 
		else {
		    System.out.println("There is no such element");
		}
	}
}
