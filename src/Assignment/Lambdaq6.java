package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Lambdaq6 {

	public static void main(String[] args)
	{
		  List<String> words = new ArrayList<>();
		  
		  words.add("Madhuri");
		  words.add("Elite");
		  words.add("Lavanya");
		  words.add("Order");
		  words.add("Dayana");
		  words.add("Yes");
		  
		  words.stream()
		  .forEach(w->System.out.print(w.charAt(0)+"\t"));
		 	
	}

}
