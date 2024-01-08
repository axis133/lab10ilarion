import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Agnia {
	
	public static void main(String[] args) throws FileNotFoundException {
		List<String> arr = new ArrayList();
		Scanner in = new Scanner(new File("input.txt"));
		String text = "";
		while (in.hasNext()) {
			String temp1 = in.nextLine();
			if (temp1.equals("*")) {
				arr.add(text);
				text = "";
			} else {
				text += temp1 + "\n";
			}
		}
		 Collections.sort(arr, new Comparator<String>() {
	           public int compare(String s1, String s2) {
	               return s1.length() - s2.length();
	           }
	       });
		 for (String elem:arr) {
			 System.out.println("///////////////////////////////");
			 System.out.println(elem);
			 System.out.println("///////////////////////////////");
			 
		 }

	}

}
